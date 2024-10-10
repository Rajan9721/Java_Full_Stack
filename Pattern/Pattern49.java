public class Pattern49 {
    public static void main(String[] args) {
        int n = 6;
        int alpha = 65+n-1;
        for(int i = n-1; i>=0; i--){
            int temp = alpha;
            for(int j = 0; j<=i; j++){
                System.out.print((char)(temp));
                temp--;
            }
            System.out.println();
        }
    }
}
