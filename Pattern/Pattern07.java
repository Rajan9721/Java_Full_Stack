public class Pattern07 {
    public static void main(String[] args){
        int row = 6, col = 5;
        for(int i = 0; i<row; i++){
            for(int j = i; j<col+i; j++){
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}
