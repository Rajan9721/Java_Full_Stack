public class Pattern51 {
    public static void main(String[] args) {
        int n = 5;
        int alpha = 65+(n-1);
        for(int i = 0; i<n; i++){
            int temp = alpha;
            for(int j = 0; j<n-i; j++){
                System.out.print((char)(temp));
                temp--;
            }
            alpha--;
            System.out.println();
        }
    }
}
