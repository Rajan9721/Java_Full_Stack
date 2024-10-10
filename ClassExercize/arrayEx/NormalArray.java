package ClassExercize.arrayEx;

import java.util.Scanner;

public class NormalArray {
    public static void main(String[] args) {
        int arr[];
        System.out.println("Enter the size of the array: ");
        int n = new Scanner(System.in).nextInt();

        arr = new int[n];

        System.out.println(arr.getClass());
        System.out.println("Enter the array elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = new Scanner(System.in).nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
