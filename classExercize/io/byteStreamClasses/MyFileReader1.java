package classExercize.io.byteStreamClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;

public class MyFileReader1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("raj.txt");
        byte b[] = new byte[fr.available()];
        fr.read(b);
        String s = new String(b);
        System.out.println(s);

    }
}
