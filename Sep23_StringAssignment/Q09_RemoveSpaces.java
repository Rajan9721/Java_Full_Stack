package Sep23_StringAssignment;

import java.util.Scanner;

public class Q09_RemoveSpaces {
    public static String squeeze(String s){
        String str = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                str = str+"";
            }else{
                str = str+s.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Given String is: "+s);
        System.out.println();
        System.out.print("After remove space string is: "+squeeze(s));
    }
}
