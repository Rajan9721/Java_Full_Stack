package Sep23_StringAssignment;

import java.util.Scanner;

public class Q32_FindDigitInString {
    public static boolean findDigit(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Digit available in string: "+findDigit(str));

    }
}
