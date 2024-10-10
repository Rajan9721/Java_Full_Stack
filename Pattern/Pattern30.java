public class Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        int alpha = 65;
        for(int i = 0; i<n; i++){
            int temp = alpha;
            for(int j = 0; j<=i; j++){
                System.out.print((char)(temp));
                temp--;
            }
            alpha+=2;
            System.out.println();
        }
    }
}
