package Looping;

import java.util.Scanner;

public class Q15SumOfN {
    public static void main(String[] args) {
        double sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        for(double i = 1; i<=n; i++){
            sum = sum + 1/i;
        }

        System.out.println("Sum of n numbers: "+sum);
    }
}
