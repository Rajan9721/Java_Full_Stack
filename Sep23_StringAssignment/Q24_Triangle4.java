package Sep23_StringAssignment;

import java.util.Scanner;

public class Q24_Triangle4 {

    public static void triangle4(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length()-i; j++){
                System.out.print(str.charAt(j));
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(" ");
            }
            for(int j=i; j<str.length(); j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Triangle is: ");
        triangle4(str);
    }
}
