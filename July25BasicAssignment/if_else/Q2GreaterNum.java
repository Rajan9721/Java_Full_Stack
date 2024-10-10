package if_else;

import java.util.Scanner;

public class Q2GreaterNum {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        a = sc.nextInt();
        System.out.println("Enter number b: ");
        b = sc.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }else {
            System.out.println("b is greater");
        }
    }
}
