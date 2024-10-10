package Aug28ArrayAssignment;

import java.util.Scanner;

public class Q01_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the array: ");

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i =0; i<n; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println("Maximum number of given array is: "+max);
    }
}
