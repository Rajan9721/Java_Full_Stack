package if_else;

import java.util.Scanner;

public class QMoBike {
    String bikeNo="UP65AB1234", name;
    int days, charges = 0;

    public void input(String name, int days){
        this.name = name;
        this.days = days;
    }

    public void compute(){
        if(days<=5){
            charges = 500*days;
        } else if (days>5 && days<=10) {
            charges = 2500 + 400*(days-5);
        } else{
            charges = 2500 + 2000 + 200*(days-10);
        }
    }

    public void display(){
        System.out.print("Bike_Number"+"  "+"Customer_Name"+"  "+"Days"+"  "+ "Charges");
        System.out.println();
        System.out.print("  "+bikeNo+"\t\t\t"+name+"\t\t"+days+"\t\t"+charges);
    }

    public static void main(String[] args){
        QMoBike bike = new QMoBike();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();

        bike.input(name, days);
        bike.compute();
        bike.display();
    }
}
