public class Pattern23 {
    public static void main(String[] args) {
        int n = 50;
        for(int i = n ; i>=1; i--){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
