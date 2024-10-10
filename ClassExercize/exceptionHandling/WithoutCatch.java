package ClassExercize.exceptionHandling;


import java.util.Scanner;

public class WithoutCatch {
    public static void main(String[] args) {
        int x;
        int y;
        System.out.println("Enter a number: ");
        x = new Scanner(System.in).nextInt();
        System.out.println("Enter second number: ");
        y = new Scanner(System.in).nextInt();

        try{
            int dev = x/y;
            System.out.println(dev);
        }
        catch(ArithmeticException e){
            System.out.println("Wrong input");
        }




        System.out.println("Program is Terminated");
    }
}
