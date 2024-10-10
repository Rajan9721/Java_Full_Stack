package Pattern;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i<n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
