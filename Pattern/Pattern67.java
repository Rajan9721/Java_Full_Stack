public class Pattern67 {
    public static void main(String[] args) {
        int n =5;
        int alpha = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(alpha+i-1));
            }
            for(int j=i-1; j>=1; j--){
                System.out.print((char)(alpha+i-1));
            }
            System.out.println();
        }
    }
}
