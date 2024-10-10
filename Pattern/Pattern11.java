public class Pattern11 {
    public static void main(String[] args) {
        int row = 5, col = 5;
        for(int i = 1; i<=row; i++){
            for(int j = col; j>0; j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
