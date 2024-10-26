package classExercize.io.characterStreamClasses.streamTokenizer;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

import static java.io.StreamTokenizer.*;

public class StreamTokenizerEx {
    public static void main(String[] args) throws IOException {
        String str = "This is a test, 200 which is simple 50";
        StringReader sr = new StringReader(str);
        StreamTokenizer st = new StreamTokenizer(sr);

        try{
            while(st.nextToken() != TT_EOF){
                System.out.println("TType value: "+st.ttype);
                switch (st.ttype){
                    case TT_WORD:
                        System.out.println("String Value: "+st.sval);
                        break;
                    case TT_NUMBER:
                        System.out.println("Number Value: "+st.nval);
                        break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
