package Looping;

import java.util.Scanner;

public class Q13Armstrong {
    public static boolean armstrong(int n){
        int digit = 0;
        int num = n;
        double sum = 0;

        while(num>0){
            digit++;
            num = num/10;
        }

        num = n;
        while(num>0){
            int last = num%10;
            sum = sum + Math.pow(last,digit);
            num = num/10;
        }
        if(sum == n){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of limit: ");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            if(armstrong(i)){
                System.out.print(i+", ");
            }
        }
    }
}
