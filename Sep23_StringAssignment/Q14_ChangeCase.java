package Sep23_StringAssignment;

import java.util.Scanner;

public class Q14_ChangeCase {
    public static String changeCase(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                newStr = newStr+(char)(ch+32);
            }else if(ch==' '){
                newStr = newStr+' ';
            }else{
                newStr = newStr+(char)(ch-32);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("New String is: "+changeCase(str));

    }
}
