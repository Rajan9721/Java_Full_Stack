package Sep23_StringAssignment;

import java.util.Scanner;

public class Q30_ReverseEachWord {

    public static String reverseEachWord(String str){
        String str1[] = str.split(" ");
        String newStr = "";
        for(int i=0; i<str1.length; i++){
            System.out.print(str1[i]);
        }
        for(int i=0; i<str1.length; i++){
            for(int j=str1[i].length()-1; j>=0; j--){
                newStr += str1[i].charAt(j);
            }
            newStr+=" ";
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("After reverse String is: "+reverseEachWord(str));

    }
}
