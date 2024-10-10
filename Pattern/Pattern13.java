public class Pattern13 {
    public static void main(String[] args) {
        int row = 5, col = 5;
        int temp = col;
        for(int i = 0; i<row; i++){
            for(int j = temp; j>i; j--){
                System.out.print(j+" ");
            }
            temp++;
            System.out.println();
        }
    }
}
