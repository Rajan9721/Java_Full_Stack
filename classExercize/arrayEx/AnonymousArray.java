package classExercize.arrayEx;

public class AnonymousArray {

    public static void show(int[] arr){
        System.out.print("Array elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Class Name: "+arr.getClass());
    }

    public static void main(String[] args) {
        show(new int[]{1, 2, 3, 5, 6, 7, 8});
    }
}
