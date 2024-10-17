package classExercize.exceptionHandling;

public class MultipleTry {
    public static void main(String[] s) {

        try{
            int x = 500/s.length;
            System.out.println(x);
        }
        catch(ArithmeticException e){
            System.out.println("Wrong input");
        }

        try{
            int z[] = new int[s.length];
            z[5] = 100;
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array size exceeded.");
        }

        // In the above program has repetition issue (Solid Principle not achieved)
        // For that reason nested try block comes to sole the problem
    }
}
