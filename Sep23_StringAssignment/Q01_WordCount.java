package Sep23_StringAssignment;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Q01_WordCount {
    public static int wordCount(String s){
        int count = 1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==' ' && isLetter(s.charAt(i+1))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();

        int res = wordCount(str);
        System.out.print("Number of words is: "+res);
    }
}
