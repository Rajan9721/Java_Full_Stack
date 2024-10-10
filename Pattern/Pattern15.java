public class Pattern15 {
    public static void main(String[] args){
        int row = 5, col = 5;
        int alpha = 65;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print((char)(alpha + j));
            }
            alpha++;
            System.out.println();
        }
    }
}
