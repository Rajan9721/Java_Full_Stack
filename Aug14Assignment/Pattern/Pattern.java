package Aug14Assignment.Pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String []args){
        int i, j, k, n;
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = my_scanner.nextInt();
        System.out.println("The X star pattern : ");

        k=n*2-1;
        for( i=1;i<=k;i++){
            for( j=1;j<=k;j++){
                if(i==0 || j==0 || j==i || j==k-i+1 || j==k||i==k)
                    System.out.print("X");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
