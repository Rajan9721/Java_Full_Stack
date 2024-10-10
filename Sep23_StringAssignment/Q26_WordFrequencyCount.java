package Sep23_StringAssignment;

import java.util.Scanner;

public class Q26_WordFrequencyCount {

    public static void wordFrequencyCount(String s){
        String[] str = s.split(" ");
        int num[] = new int[str.length];

        for(int i=0; i<str.length; i++){
            num[i] = 1;
            for(int j=i+1; j<str.length; j++){
                if(str[i].equals(str[j])){
                    num[i]++;
                    str[j]="";
                }
            }
        }

        for(int i=0; i<str.length; i++){
            if(str[i]!=""){
                System.out.println(str[i]+" = "+num[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String str = sc.nextLine();

        System.out.println("Frequency of String is: ");
        wordFrequencyCount(str);
    }
}
