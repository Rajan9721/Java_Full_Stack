package if_else;

import java.util.Scanner;

public class Q13Employee {
    public static void check(int age, String gender){
        if(gender == "Female" || gender == "female"){
            System.out.println("She will work only in urban areas.");
        } else{
            if(age>=20 && age<40){
                System.out.println("he may work anywhere.");
            }
            else if(age>=40 && age<=60){
                System.out.println("He will work in urban areas only.");
            }else{
                System.out.println("Error");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your gender Male/Female: ");
        String sex = sc.next();
        System.out.println("Enter your marital status: ");
        String marital = sc.next();

        check(age, sex);
    }
}
