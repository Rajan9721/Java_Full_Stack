package Looping;

import java.util.Random;
import java.util.Scanner;

public class Q17RandomNumGuss {
    public static void main(String[] args) {
        Random num = new Random();
        int num1 = num.nextInt(1000);
        System.out.println(num1);

        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Guess a number: ");
            int guess = sc.nextInt();

            if(guess==num1){
                System.out.println("Excellent, you are guess right");
                break;
            }
            else if(guess>num1){
                System.out.println("To high, Try again");
            }
            else {
                System.out.println("To low, try again");
            }
        }
    }
}
