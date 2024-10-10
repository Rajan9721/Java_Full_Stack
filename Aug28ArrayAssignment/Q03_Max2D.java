package Aug28ArrayAssignment;

public class Q03_Max2D {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 10}, {5, 4, 2}, {6, 9,3}};
        int max = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Maximum number of given arrays: "+max);

    }
}
