package classExercize.io.characterStreamClasses.streamTokenizer;

import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        String s = "country=Bharat;capital=delhi;country=japan;capital=tokyo;";
        StringTokenizer st = new StringTokenizer(s,";,=");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
