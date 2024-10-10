package Pattern;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                int k = i%2;
                if(k==0){
                    System.out.print("- ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for(int i = n-1; i>=1; i--){
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                if(i%2 == 0){
                    System.out.print("_ ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
