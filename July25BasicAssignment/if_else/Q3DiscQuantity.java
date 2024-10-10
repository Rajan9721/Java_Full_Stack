package if_else;

import java.util.Scanner;

public class Q3DiscQuantity {
    public static void main(String[] args) {
        int quantity;
        int cost = 0, dis;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Quantity: ");
        quantity = sc.nextInt();
        if(quantity>=1000){
            dis = 100*quantity/10;
            cost = 100*quantity-dis;
        }else{
            cost = 100*quantity;
        }

        System.out.println("Amount need to pay: "+ cost);
    }
}
