package Aug14Assignment.Pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*n-1-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
