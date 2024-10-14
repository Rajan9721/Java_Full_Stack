package ClassExercize.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fw = new FileOutputStream("raj.txt"); // Write Mode
//        FileOutputStream fw = new FileOutputStream("raj.txt", true); // Append mode
        FileOutputStream fw = new FileOutputStream(new File("E:\\IO Operation txt files/raj.txt")); // Write mode
//        FileOutputStream fw = new FileOutputStream(new File("E:\\IO Operation txt files\\raj.txt"), true);
    }
}
