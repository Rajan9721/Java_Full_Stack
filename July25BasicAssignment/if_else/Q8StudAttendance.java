package if_else;

import java.util.Scanner;

public class Q8StudAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of classes held: ");
        float num = sc.nextInt();
        System.out.println("Enter number of classes attended: ");
        float att = sc.nextInt();
        float per = (att/num)*100;
        System.out.println("Percentage of class attended: "+per);
        if(per<75){
            System.out.println("Student is not allowed to sit in exam.");
        }else{
            System.out.println("Student is allowed to sit in exam.");
        }
    }
}
