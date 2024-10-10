public class Pattern59 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                if(i%2==0){
                    System.out.print(j);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
