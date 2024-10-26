package Aug14Assignment.Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }

            for (int j = n-i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
