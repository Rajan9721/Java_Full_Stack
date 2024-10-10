package if_else;

import java.util.Scanner;

public class Q1Square {
    public static void main(String[] args) {
        int length;
        int breadth;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextInt();
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("Square");
        }else {
            System.out.println("Rectangle");
        }
    }
}
