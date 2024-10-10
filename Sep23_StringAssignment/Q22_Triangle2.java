package Sep23_StringAssignment;

import java.util.Scanner;

public class Q22_Triangle2 {

    public static void triangle2(String str){
        int len = str.length();
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length()-i; j++){
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
        triangle2(str);
    }
}
