package classExercize.io.byteStreamClasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fw = new FileOutputStream("raj.txt"); // Write Mode
//        FileOutputStream fw = new FileOutputStream("raj.txt", true); // Append mode
//        FileOutputStream fw = new FileOutputStream(new File("E:\\IO Operation txt files/raj.txt")); // Write mode
//        FileOutputStream fw = new FileOutputStream(new File("E:\\IO Operation txt files\\raj.txt"), true); // Append mode

        String s = "India is a good country. India, officially the Republic of India (ISO: Bhārat Gaṇarājya),[21] is a country in South Asia. " +
                "It is the seventh-largest country by area; the most populous country from June 2023[22][23] and from the time of its " +
                "independence in 1947, the world's most populous democracy.[24][25][26] Bounded by the Indian Ocean on the south, the " +
                "Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the west;[j] " +
                "China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east. In the Indian Ocean, " +
                "India is in the vicinity of Sri Lanka and the Maldives; " +
                "its Andaman and Nicobar Islands share a maritime border with Thailand, Myanmar, and Indonesia.";

        byte ch[] = s.getBytes();
        fw.write(ch);

//        for(int i=0; i<ch.length; i++){
//            fw.write(ch[i]);
//        }
        fw.close();
        System.out.println("File created successfully");
    }
}