package Sep23_StringAssignment;

import java.util.Scanner;

public class Q29_NonRepeatingFirstChar {

    public static int nonRepeatingFirstChar(String s){
        for(int i=0; i<s.length(); i++){
            boolean res = true;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                   res = false;
                   break;
                }
            }
            if(res){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        int res = nonRepeatingFirstChar(str);
        if(res!=-1){
            System.out.println("First non repeating character of "+str+" is: "+ str.charAt(res));
        }else{
            System.out.println("All characters are repeating");
        }

    }
}
