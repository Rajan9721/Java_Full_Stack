package if_else;

import java.util.Scanner;

public class Q14GreaterNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a = sc.nextInt();
        System.out.println("Enter number 2: ");
        b = sc.nextInt();
        System.out.println("Enter number 3: ");
        c = sc.nextInt();
        
        if(a<b){
            if(b<c){
                System.out.println(a+", "+b+", "+c);
            }
            else {
                if(b<a){
                    System.out.println(b+", "+a+", "+c);
                }else{
                    System.out.println(c+", "+a+", "+b);
                }
            }
        }else{
            if(c<b){
                System.out.println(c+", "+b+", "+a);
            }else{
                if(c<a){
                    System.out.println(b+", "+c+", "+a);
                }else{
                    System.out.println(b+", "+a+", "+c);
                }
            }
        }

    }
}
