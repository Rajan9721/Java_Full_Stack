package classExercize.io.byteStreamClasses;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataRead{
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(new FileInputStream("chachi.txt"));
        String s = " ";
        while(s!=null){
            s = din.readLine();
            if(s!=null)
                System.out.println(s);
        }
        din.close();
    }
}
