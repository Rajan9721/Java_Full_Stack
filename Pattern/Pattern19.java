public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int alpha = 65;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)(alpha));
                alpha++;
            }
            System.out.println();
        }
    }
}
