package Aug28ArrayAssignment;

import java.util.Scanner;

public class Q11_MatrixMultiply {

    public static void printMatrix(int arr[][]){
        int row = arr.length;
        for(int i=0; i<row; i++){
            int col = arr[i].length;
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int mat1[][], int mat2[][], int m, int n){
        int arr[][]=new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = 0;
                for(int k=0; k<mat2.length; k++){
                    arr[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*******************For multiply two matrix 1st matrix col and 2nd matrix row size must be same*********************");
        System.out.println();

        System.out.print("Enter the row size and col size for first matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr1[][] = new int[m][n];
        System.out.println("Enter the 1st Array element-" );
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the row size and col size for first matrix: ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();

        int arr2[][] = new int[m2][n2];
        System.out.println("Enter the 2nd Array element-" );
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st Matrix is-");
        printMatrix(arr1);
        System.out.println("2nd Matrix is-");
        printMatrix(arr2);


        if(arr1[0].length == arr2.length){
            int arr[][] = multiplyMatrix(arr1,arr2,arr1.length, arr2[0].length);
            System.out.println("After adding matrix is- ");
            printMatrix(arr);

        }
        else {
            System.out.println("Invalid input, Matrix can not be multiply because 1st matrix col and 2nd matrix row size must be same");
        }




    }
}
