public class Pattern68 {
    public static void main(String[] args) {
        int n=5;
        int alpha=65;
        for(int i=n-1; i>=0; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print((char)(alpha+i));
            }
            for(int j=2; j<=n-i; j++){
                System.out.print((char)(alpha+i));
            }
            System.out.println();
        }

        System.out.println("---------------------OR------------------------");
        char curChar = 'E';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*i-1; j++){
                System.out.print((char)(curChar));
            }
            curChar--;
            System.out.println();
        }
    }
}
