import java.util.Scanner;

public class Pattern72 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
