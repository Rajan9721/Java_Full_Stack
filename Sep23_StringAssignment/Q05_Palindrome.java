package Sep23_StringAssignment;

import java.util.Scanner;

public class Q05_Palindrome {
    public static boolean palindrome(String s){
        String str = "";

        for(int i=s.length()-1; i>=0; i--){
            str = str+s.charAt(i);
        }
        if(str==s){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();

        System.out.print("Given String is: "+s);
        System.out.println();
        System.out.print("Number of vowel in given string is: "+palindrome(s));
    }
}
