package classExercize.io.byteStreamClasses;

import java.io.FileInputStream;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("E:\\IO Operation txt files/raj.txt");
//        FileInputStream fr = new FileInputStream(new File("E:\\IO Operation txt files/raj2.txt"))
        int i = 0;

        while((i=fr.read())!=-1){
            System.out.println((char)i);
        }
        fr.close();
    }
}
