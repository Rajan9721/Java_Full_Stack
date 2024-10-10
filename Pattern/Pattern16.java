public class Pattern16 {
    public static void main(String[] args){
        int row = 5, col = 5;
        int alpha = 65;
        for(int i = 0; i<row; i++){
            for(int j = col; j>0; j--){
                System.out.print((char)(alpha+j));
            }
            alpha++;
            System.out.println();
        }
    }
}
