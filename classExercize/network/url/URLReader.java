package classExercize.network.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
    public static void main(String[] args) throws Exception{
        URL google = new URL("http://www.google.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
        String inputLine;
        while((inputLine = in.readLine())!=null){
            System.out.println(inputLine);
        }
        in.close();
    }
}
