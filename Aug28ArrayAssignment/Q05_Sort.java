package Aug28ArrayAssignment;

import java.util.Scanner;

public class Q05_Sort {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int n = new Scanner(System.in).nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = new Scanner(System.in).nextInt();
        }

//  For sorting logic
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
