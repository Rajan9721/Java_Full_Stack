package if_else;

import java.util.Scanner;

public class Q9MedicalCause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Y for yes and N for no who has medical cause: ");
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y'){
            System.out.println("Yes he/she has the medical cause.");
        }else if(ch=='N' || ch == 'n'){
            System.out.println("No he/she has not the medical cause.");
        }else{
            System.out.println("Wrong input.");
        }
    }
}
