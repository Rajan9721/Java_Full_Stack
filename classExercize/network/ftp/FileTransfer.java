package classExercize.network.ftp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class FileTransfer extends JFrame implements ActionListener {
    JFrame jf;
    JButton jb1, jb2;
    TextField tf;
    JFileChooser jfc;
    Socket s;
    DataInputStream din;
    DataOutputStream dout, dout1;
    String s1 = new String();
    String s2 = "";
    File f;
    FileTransfer(){
        jf = new JFrame("FILE TRANSFER");
        jf.setSize(400,400);
        Container c = jf.getContentPane();
        c.setBackground(Color.red);
        jf.setLayout(null);
        jb1 = new JButton("choose file");
        jb2 = new JButton("send");
        jb1.setBounds(30,50,100,50);
        jb2.setBounds(250,150,70,50);
        jf.add(jb1);
        jf.add(jb2);
        tf = new TextField();
        tf.setEditable(false);
        tf.setBackground(Color.white);
        tf.setBounds(150,50,190,50);
        jf.add(tf);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jfc = new JFileChooser();
        jb1.addActionListener(this);
        jb2.addActionListener(this);
    }
    public void fileTransfer(String s1) {
        try{
            dout1.writeUTF(s1);
            dout1.flush();
            s2 = f.getAbsolutePath();
            FileReader fr = new FileReader(s2);
            BufferedReader br = new BufferedReader(fr);
            String s3="";
            do{
                s3 = br.readLine();
                if(s3!=null){
                    dout.writeUTF(s3);
                    dout.flush();
                }
            }while(s3!=null);

        }catch(Exception e){
            System.out.println(e+"Some Error j j j j");
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb1){
            int x = jfc.showOpenDialog(null);
            if(x==JFileChooser.APPROVE_OPTION){

            }
        }
    }


}