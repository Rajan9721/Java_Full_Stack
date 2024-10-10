package ClassExercize.arrayEx;

public class FinalArray {
    public static void main(String[] args) {
        final int[] arr={10,20,30};
        System.out.println("Before change: "+arr[0]);
        arr[0] = 500;
        System.out.println("After change: "+arr[0]);

        int[] x={5, 7, 8};
//        arr = x;  // compile time error(Cannot assign a value to final variable 'arr')

    }
}
