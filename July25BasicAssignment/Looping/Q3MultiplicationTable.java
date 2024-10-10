package Looping;
import java.util.Scanner;
public class Q3MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number for table: ");
        n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.print(n*i+" ");
        }
    }
}
