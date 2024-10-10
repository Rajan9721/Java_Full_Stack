package if_else;

public class Q4BonusAmount {
    public static void main(String[] args) {
        int sal, year, bonus, total=0;
        System.out.println("Enter your salary: ");
        sal = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter your year of service: ");
        year = new java.util.Scanner(System.in).nextInt();

        if(year>=5){
            bonus = (sal*5/100);
            total = sal + bonus;
        }
        else{
            bonus = 0;
            total = sal;
        }

        System.out.println("Bonus amount is: "+ bonus);
        System.out.println("Total salary is: "+ total);
    }
}
