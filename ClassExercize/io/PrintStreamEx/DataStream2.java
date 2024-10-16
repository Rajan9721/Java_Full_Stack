package ClassExercize.io.PrintStreamEx;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DataStream2 {
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("appsquadz.txt");

        PrintStream ps = new PrintStream(fout);
        String s = " ";

        while(!s.equals("stop")){
            s = din.readLine();
            ps.println(s);
        }
        din.close();
        ps.close();

    }
}
