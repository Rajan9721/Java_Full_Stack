package classExercize.network.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
    static String inputLine = " ";
    public static void main(String[] args) throws Exception{
        URL google = new URL("https://www.google.com/");
        URLConnection uc = google.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(uc.getInputStream())
        );

        while(inputLine!=null){
            inputLine = in.readLine();
            System.out.println(inputLine);
        }
        in.close();
    }
}
