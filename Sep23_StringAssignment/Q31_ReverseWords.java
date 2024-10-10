package Sep23_StringAssignment;

import java.util.Scanner;

public class Q31_ReverseWords {

    public static void reverseAllWords(String s){
        String str[] = s.split(" ");
        for(int i=str.length-1; i>=0; i--){
            System.out.print(str[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Reverse order of "+str+" is:=> ");
        reverseAllWords(str);
    }
}
