package Sep23_StringAssignment;

import java.util.Scanner;

public class Q04_ReverseString {
    public static String reverse(String s){
        String revStr="";
        for(int i=s.length()-1; i>=0; i--){
            revStr = revStr+s.charAt(i);
        }
        return revStr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Given String is: "+s);
        System.out.print("Reverse of given string is: "+reverse(s));
    }
}
