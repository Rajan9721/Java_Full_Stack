package Aug28ArrayAssignment;

import java.util.Scanner;

public class Q10_MatrixAdd {

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
    public static int[][] matrixAdd(int arr1[][], int arr2[][], int row, int col){
        int arr3[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*******************For adding two matrix Both matrix row and col size must be same*********************");
        System.out.println();

        System.out.print("Enter the row size: ");
        int m = sc.nextInt();
        System.out.print("Enter the col size: ");
        int n = sc.nextInt();

        int arr1[][] = new int[m][n];
        System.out.println("Enter the 1st Array element-" );
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int arr2[][] = new int[m][n];
        System.out.println("Enter the 2nd Array element-" );
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st Matrix is-");
        printMatrix(arr1);
        System.out.println("2nd Matrix is-");
        printMatrix(arr2);

        int arr[][] = matrixAdd(arr1,arr2,m,n);
        System.out.println("After adding matrix is- ");
        printMatrix(arr);
    }
}
