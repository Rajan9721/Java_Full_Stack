package Aug14Assignment.Pattern;

public class Pattern05 {
    public static void main(String[] args) {
        int n = 11;
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==(n-1) || j==0 || j==(n-1) || i-j==0 || i+j==(n-1)){
                    System.out.print(" # ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
