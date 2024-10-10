package ClassExercize.exceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {

    public void getAge(int age){
        if(age<18){
            throw new ArithmeticException("Invalid age");
        }else {
            System.out.println("Age is: "+age);
        }
    }
    public static void main(String[] args) {

        ThrowKeyword th = new ThrowKeyword();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        try{
            th.getAge(age);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }


    }
}
