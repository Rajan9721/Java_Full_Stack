package classExercize.exceptionHandling;

public class MultipleCatch {
    public static void main(String[] s) {
        try{
            int x = 500/s.length;
            System.out.println("Value of x is: "+x);

            int z[] = new int[s.length];
            z[5] = 122;

        }
        catch(ArithmeticException ae){
            System.out.println("Wrong input.");
        }
//        catch(Exception e){
//            System.out.println("Something is wrong");
//        }


//        catch(ArrayIndexOutOfBoundsException e)
//  // Showing compile time error because we have already catch the exception in parent class(Exception)  (AIOOBE has already been caught)
//        {
//            System.out.println("The size of array is exceed.");
//        }

    }
}
