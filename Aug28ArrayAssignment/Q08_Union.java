package Aug28ArrayAssignment;

import java.util.Scanner;

public class Q08_Union {
    public static void unionOfArrays(int arr1[], int arr2[], int m, int n){
        int i=0, j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }

        while(i<m){
            System.out.print(arr1[i++]+" ");
        }

        while(j<n){
            System.out.print(arr2[j++]+" ");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size: ");
        int m = sc.nextInt();
        System.out.print("Enter the 2nd array size: ");
        int n = sc.nextInt();

        int arr1[] = new int[m];
        System.out.println("Enter the "+m+" Array element-" );
        for(int i=0; i<m; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[n];
        System.out.println("Enter the "+n+" Array element-" );
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        unionOfArrays(arr1, arr2, m, n);
    }
}
