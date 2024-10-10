public class Pattern75 {
    public static void main(String[] args) {
        int n=8;
        int alpha = 65;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print((char)(alpha+j));
            }
            int temp = alpha+i;
            for(int j=0; j<=i-1; j++){
                temp=temp-1;
                System.out.print((char)(temp));

            }
            System.out.println();

        }
    }
}
