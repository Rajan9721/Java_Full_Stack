package Sep23_StringAssignment;

import java.util.Scanner;

public class Q21_Triangle1 {

    public static void triangle1(String str){
        int length = str.length();
        for(int i=0; i<length; i++){
            for(int j=0; j<=i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for sorting: ");
        String str = sc.nextLine();

        System.out.println("After sorting string is: ");
        triangle1(str);
    }
}
