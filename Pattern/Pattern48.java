public class Pattern48 {
    public static void main(String[] args) {
        int n = 5;
        int alpha = 65;
        for(int i = n; i>=1; i--){
            for(int j = 0; j<i; j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
    }
}