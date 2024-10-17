package classExercize.io.byteStreamClasses;

import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ps{

    public static void main(String... args) throws IOException{

        FileOutputStream fout = new FileOutputStream("chachi.txt");   // always create the new file
        PrintStream ps = new PrintStream(fout);

        FileOutputStream fout1 = new FileOutputStream("chacha.txt", true);  // true means when we are writes true then its appends the new characters(Sentence/words)
        PrintStream ps1 = new PrintStream(fout1);

        System.out.println("before");
        PrintStream ps4 = System.out;

        System.out.println("System.out reference id: "+ps4);

        System.setOut(ps);  // setOut(); is a static method of System Class
        System.setErr(ps1); // setErr(); is also a static method of System Class

        System.out.println("chachi 420");
        System.out.println("chachi 840");
        System.out.println("chacha 420");
        System.out.println("chacha 840");

        // System.out = ps4;

        System.setOut(ps1);
        System.out.println("chacha 240");
        System.out.println("chacha 360");

        System.setOut(ps4);
        ps4.println("after");
        System.out.println("Via actual out");
    }
}
