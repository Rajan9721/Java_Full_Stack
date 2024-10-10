package if_else;

import java.util.Scanner;

public class Q7AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for absolute number: ");
        int num = sc.nextInt();
        if(num<0){
            num = -1*num;
        }
        System.out.println("Absolute number is: "+num);
    }
}
