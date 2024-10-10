package Sep23_StringAssignment;

import java.util.Scanner;

public class Q11_Length {
    public static int length(String str){
        int length = 0;
        try{
            while(str.charAt(length)!='\0'){
                length++;
            }
        }catch(StringIndexOutOfBoundsException e){

        }
        return length;
    }

    public static int length2(String s){
        char ch[] = s.toCharArray();
        return ch.length;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to know the length: ");
        String str = sc.nextLine();
        System.out.println("Rajan rajbhar ".length());
        System.out.println("Length of the given String is: "+length(str));
        System.out.println("Length of the given String is: "+length2(str));
    }

}
