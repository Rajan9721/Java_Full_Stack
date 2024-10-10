package Aug28ArrayAssignment;

import java.util.Scanner;

public class Q02_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Minimum elements of the given array is: "+min);
    }
}
