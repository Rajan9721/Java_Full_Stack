package NumbersAssignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q01HappyNumber {

    public static int squareSum(int n){
        int sum = 0;
        while(n!=0){
            int temp = n%10;
            sum += temp*temp;
            n = n/10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = squareSum(n);
        }
        return (n==1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Is given number Happy? => "+isHappy(num));

    }
}
