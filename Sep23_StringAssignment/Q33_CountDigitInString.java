package Sep23_StringAssignment;

import java.util.Scanner;

public class Q33_CountDigitInString {

    public static int countDigits(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Number of digit available in string: "+countDigits(str));
    }
}
