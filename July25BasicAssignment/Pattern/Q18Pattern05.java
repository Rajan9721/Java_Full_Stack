package Pattern;

public class Q18Pattern05 {
    public static void main(String[] args){
        int n = 5;
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
}
