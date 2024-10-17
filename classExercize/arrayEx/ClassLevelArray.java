package classExercize.arrayEx;

import java.util.Scanner;

public class ClassLevelArray {
    int z[];

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int x = new Scanner(System.in).nextInt();

        ClassLevelArray obj1 = new ClassLevelArray();
        obj1.z = new int[x];
        System.out.println("Class get Class: "+obj1.z.getClass());
        Class c= obj1.z.getClass();
        System.out.println("Array class name: "+c.getName());

        for(int i=0; i<obj1.z.length; i++){
            obj1.z[i] = new Scanner(System.in).nextInt();
        }

        for(int i=0; i<obj1.z.length; i++){
            System.out.print(obj1.z[i]+" ");
        }
        System.out.println();
        System.out.println("***********\t For Each Loop \t***********");

        for(int a : obj1.z){
            System.out.print(a+" ");
        }
    }
}
