public class Pattern12 {
    public static void main(String[] args) {
        int row = 5, col = 5;
        for(int i = row; i>0; i--){
            for(int j = 1; j<=col; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
