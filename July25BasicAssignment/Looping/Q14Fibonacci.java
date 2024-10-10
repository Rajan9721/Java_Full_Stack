package Looping;

import java.util.Scanner;

public class Q14Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print fibonacci series: ");
        n = sc.nextInt();

        System.out.print(num1+" "+num2+" ");
        for(int i = 2; i<n; i++){
            num3 = num1 + num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
        }
    }
}
