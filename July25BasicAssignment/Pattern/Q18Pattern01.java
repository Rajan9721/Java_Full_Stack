package Pattern;

public class Q18Pattern01 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i<(n-1)/2){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
