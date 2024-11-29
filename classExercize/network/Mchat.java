package classExercize.network;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Mchat implements ActionListener {
	JFrame f,f1;
	JLabel l, l1, l2;
	JTextField tf;
	JTextArea ta, ta1, ta2;
	JScrollPane js, js1, js2;
	JButton b, b1, b2;
	Socket s;
	DataInputStream din, din1;
	DataOutputStream dout, dout1;
	String st="",name, st1="",st2="";
	int flag=0;
	public Mchat(){
		f = new JFrame("LogIn Form");
		f1 = new JFrame("CHAT");
		
		l = new JLabel("Enter user name:");
		l1 = new JLabel("Sent items");
		l2 = new JLabel("wanna send");
		l.setBounds(50,50,100,30);
		
		tf = new JTextField(100);
		tf.setBounds(160,50,100,30);
		
		b = new JButton("LOG IN");
		b2 = new JButton("Log OUt");
		
		b.setBounds(100,100,90,30);
		
		f.getContentPane().add(l);
		f.getContentPane().add(tf);
		f.getContentPane().add(b);
		
		ta = new JTextArea(250,60);
		ta1 = new JTextArea(250,160);
		ta2 = new JTextArea(250,160);
		
		js = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		js1 = new JScrollPane(ta1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		js2 = new JScrollPane(ta2, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		js.setBounds(160,230,250,60);
		js1.setBounds(160,50,250,160);
		js2.setBounds(450,50,100,160);
		l1.setBounds(40,50,80,30);
		l2.setBounds(40,230,80,30);
		
		b1 = new JButton("SEND");
		b1.setBounds(75,300,80,30);
		b2.setBounds(170,300,120,30);
		
		f1.getContentPane().add(b1);
		f1.getContentPane().add(b2);
		f1.getContentPane().add(l1);
		f1.getContentPane().add(l2);
		f1.getContentPane().add(js);
		f1.getContentPane().add(js1);
		f1.getContentPane().add(js2);
		
		f1.getContentPane().setLayout(null);
		f1.setSize(600,600);
		f1.setVisible(false);
		
		f.getContentPane().setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		try{
			s = new Socket("13.201.161.138",8);
			//s = new Socket("localhost", 8);
			
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			
			My m = new My(din);
			Thread t1 = new Thread(m);
			t1.start();
			ta2.setText("");
		}catch(Exception e){
			System.out.println(""+e);
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b){
			try{
				name = tf.getText();
				f.setVisible(false);
				f1.setVisible(true);
				clientChat1();
			}catch(Exception l){}		
		}
		if(e.getSource()==b1){
			try{
				clientChat();
			}catch(Exception j){
				j.printStackTrace();
			}
		}
		if(e.getSource()==b2){
			try{
				clientChat2();
			}catch(Exception j){
				j.printStackTrace();
			}
		}
	}
	
	public void clientChat2() throws IOException {
		dout.writeUTF("('"+name+"logged out"+")");
		dout.flush();
		System.exit(0);
	}
	
	public void clientChat1() throws IOException{
		String s1 = name+" logged in";
		dout.flush();
		dout.writeUTF(s1);
		dout.flush();
	}
	
	public void clientChat() throws IOException{
		String s1 = "";
		s1 = ta.getText();
		dout.writeUTF("*"+name+"::"+s1);
		dout.flush();
		ta.setText("");
	}
	
	public static void main(String[] args){
		new Mchat();
	}

	class My implements Runnable{
		DataInputStream din;

		My(DataInputStream din){
			this.din = din;
		}

		public void run(){
			String st = " ";
			String str[] = new String[40];
			st2 = "";
			int j=0;
			do{
				try{
					st = "";
					st = din.readUTF();
					if(st.startsWith(""+"'"))
					{
						ta2.setText(st);
					}
					else{
						st1 = st1+st+"\n";
					}
					ta1.setText(st1);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}while(st!=null);
		}
	}
}