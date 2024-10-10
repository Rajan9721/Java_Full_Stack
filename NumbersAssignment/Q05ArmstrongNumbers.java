package NumbersAssignment;

import java.util.Scanner;

public class Q05ArmstrongNumbers {

    public int pow(int num, int digit){
        int pow = 1;
        while(digit!=0){
            pow = pow*num;
            digit--;
        }
        return pow;
    }
    public boolean checkArm(int n){
        int digit = 0;
        double sum = 0;
        int num = n;

        while(num>0){
            num = num/10;
            digit++;
        }
        num = n;

        while(num>0){
            int temp = num%10;
            sum = sum + pow(temp, digit);
            num = num/10;
        }

        if(sum == n){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Q05ArmstrongNumbers q5 = new Q05ArmstrongNumbers();
        for(int i = 0; i<=num; i++){
            if(q5.checkArm(i)){
                System.out.print(i+" ");
            }
        }

        System.out.println(q5.pow(2,5));

    }
}
