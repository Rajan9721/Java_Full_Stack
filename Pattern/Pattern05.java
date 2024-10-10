public class Pattern05 {
    public static void main(String[] args) {
        int r = 6, c = 6;
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=c; j++){
                if(j%2 == 0){
                    System.out.print(" 0 ");
                    continue;
                }
                System.out.print(" 1 ");
            }
            System.out.println();
        }
    }
}
