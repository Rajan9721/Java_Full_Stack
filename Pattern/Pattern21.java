public class Pattern21 {
    public static void main(String[] args) {
        int n =5;
        int alpha = 65;
        int small = 97;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i%2==0){
                    System.out.print((char)(alpha+j));
                }else{
                    System.out.print((char)(small+j));
                }
            }
            System.out.println();
        }
    }
}
