package ClassExercize.io.PrintStreamEx;

import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("appsquadz1.txt");
        DataOutputStream dout = new DataOutputStream(fout);

        String s = " ";
        while(!s.equals("stop")){
            s = din.readLine();
            System.out.println(s);
            dout.writeChars(s);
            //dout.writeUTF(s);
            // dout.writeBytes(s);
            // dout.writeChars(s);

            dout.flush();
        }
        din.close();
        dout.close();

    }
}
