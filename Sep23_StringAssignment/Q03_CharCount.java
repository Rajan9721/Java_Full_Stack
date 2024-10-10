package Sep23_StringAssignment;

import java.util.Scanner;

public class Q03_CharCount {
    public static int charCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static int charCount2(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int res = charCount(s);
        int res2 = charCount2(s);

        System.out.print("Number of character in given String is: "+res);
        System.out.println();
        System.out.print("Number of character in given String is via 2nd method: "+res);
    }
}
