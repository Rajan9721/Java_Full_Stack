public class Pattern04 {
    public static void main(String[] args) {
        int n = 5, m = 5;
        int k = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
//  OR
        System.out.println("********************************");

        int temp = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print( temp+j +" ");
            }
            temp = temp+m;
            System.out.println();
        }
    }
}
