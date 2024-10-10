package Aug28ArrayAssignment;

import java.util.Scanner;

public class Q04_Min2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size of the array: ");
        int row = sc.nextInt();

        System.out.print("Enter col size of the array: ");
        int col = sc.nextInt();

        System.out.print("Enter the array elements: ");

        int arr[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int min = arr[0][0];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Minimum elements of the given array is: "+min);
    }
}
