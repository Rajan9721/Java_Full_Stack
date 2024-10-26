package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i-j<=0 && j<=(n-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
