package if_else;

import java.util.Scanner;

public class Q6AgeCompare {

    public int max(int age1, int age2, int age3){
        int max = age1;
        if(age2>max){
            max = age2;
        }
        if(age3>max){
            max = age3;
        }
        return max;
    }

    public int min(int age1, int age2, int age3){
        int min = age1;
        if(age2<min){
            min = age2;
        }
        if(age3<min){
            min = age3;
        }
        return min;
    }

    public static void main(String[] args) {
        Q6AgeCompare compare = new Q6AgeCompare();

        int age1, age2, age3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first people age: ");
        age1 = sc.nextInt();
        System.out.println("Enter the second people age: ");
        age2 = sc.nextInt();
        System.out.println("Enter the third people age: ");
        age3 = sc.nextInt();

        System.out.print("Oldest people in "+age1+":"+age2+":"+age3+" is: "+compare.max(age1,age2,age3));
        System.out.println();
        System.out.print("Youngest people is: "+age1+":"+age2+":"+age3+" is: "+compare.min(age1,age2,age3));

    }
}
