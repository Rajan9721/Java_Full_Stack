package Sep23_StringAssignment;

import java.util.Scanner;

public class Q13_frequencyCount {
    public static void frequencyCount(String str){
        char s[] = str.toCharArray();
        int count[] = new int[s.length];
        for(int i=0; i<str.length(); i++){
            count[i] = 1;
            for(int j=i+1; j<str.length(); j++){
                if(s[i]==s[j]) {
                    count[i]++;
                    s[j] = '0';
                }
            }
        }

        for(int i=0; i<count.length; i++){
            if(s[i]!=' ' && s[i]!='0'){
                System.out.println(s[i]+"-"+count[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to know the frequency: ");
        String str = sc.nextLine();

        frequencyCount(str);

    }
}
