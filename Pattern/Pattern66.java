public class Pattern66 {
    public static void main(String[] args) {
        int n =5;
        int num = 1;
        for(int i=1; i<=n; i++){
            int temp = num;
            for(int j=1; j<=i; j++){
                System.out.print(temp);
                temp--;
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            num+=2;
            System.out.println();
        }
    }
}
