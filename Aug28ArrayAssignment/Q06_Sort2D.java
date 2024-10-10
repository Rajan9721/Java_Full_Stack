package Aug28ArrayAssignment;

public class Q06_Sort2D {
    public static void main(String[] args) {
        int a[][] = {{8,6,4,3},{5,2,1,9},{19,15,24,0},{22,45,7,11}};

        for(int i=0; i<a.length; i++){

            for(int k=0; k<a[i].length; k++){

                for(int j=0; j<a[i].length-1-k; j++){

                    if(a[i][j]>a[i][j+1]){

                        int temp = a[i][j];
                        a[i][j] = a[i][j+1];
                        a[i][j+1] = temp;

                    }
                }
            }
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
