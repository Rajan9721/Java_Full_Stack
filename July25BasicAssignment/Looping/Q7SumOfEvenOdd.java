package Looping;

import java.util.Scanner;

public class Q7SumOfEvenOdd {
    public static void main(String[] args) {
        int n, even = 0 , odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter limits: ");
        n = sc.nextInt();
        System.out.println("Enter numbers: ");
        for(int i = 0; i<n; i++){
            int temp = sc.nextInt();
            if(temp%2==0){
                even = even+temp;
            }else{
                odd = odd+temp;
            }
        }

        System.out.println("Sum of even number are: "+even+", Sum of odd numbers are: "+odd);
    }
}
