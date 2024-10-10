package Looping;
import java.util.Scanner;

public class Q5Power {

    public void power(int a, int b){
        int pow = a;
        for(int i = 1; i<=b; i++){
            pow = pow*a;
        }
        System.out.println(pow);
    }
    public static void main(String[] args) {
        Q5Power power = new Q5Power();

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        num2 = sc.nextInt();

        power.power(num1, num2);

    }
}
