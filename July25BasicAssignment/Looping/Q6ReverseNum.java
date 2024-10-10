package Looping;
import java.util.Scanner;

public class Q6ReverseNum {
    public static int reverse(int n){

        int rev = 0, num = n;

        while(num>0){
            int temp = num%10;
            rev = rev*10+temp;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Reverse number is: "+reverse(n));
    }
}
