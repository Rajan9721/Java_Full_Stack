public class Pattern22 {
    public static void main(String[] args) {
        int n =5;
        int alpha = 64;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i%2==0){
                    System.out.print((char)(alpha+j));
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
