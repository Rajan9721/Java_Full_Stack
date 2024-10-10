package Looping;

import java.util.Scanner;

public class Q11FindPosNegZero {
    public static void main(String[] args) {
        int n, numbers, pos = 0, neg = 0, zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to enter: ");
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print("Enter the number "+(i+1)+": ");
            numbers = sc.nextInt();
            if(numbers>0){
                pos++;
            }else if(numbers<0) {
                neg++;
            }else{
                zero++;
            }
        }

        System.out.println(pos+" Positive numbers, "+neg+" Negative num, "+zero+" Zero are available.");
    }
}
