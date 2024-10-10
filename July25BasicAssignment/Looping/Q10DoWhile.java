package Looping;

import java.util.Scanner;

public class Q10DoWhile {
    public static void main(String[] args) {
        int num1, num2, sum = 0, n = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            sum = num1 + num2;

            System.out.println("Sum of Both numbers: "+sum);

            System.out.println("Do you want to perform operation again (For Yes enter 1 , For No enter 0) ");
            n = sc.nextInt();
            sum = 0;
//            if(n == 1){
//                continue;
//            }
//            else {
//                break;
//            }
        }while(n==1);
    }
}
