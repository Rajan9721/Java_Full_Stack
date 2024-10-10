package Sep23_StringAssignment;

import java.util.Scanner;

public class Q28_BinaryToDecimal {

    public static int binaryToDecimal(String str) {
        int dec_num = 0;
        int power = 0;
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                dec_num += (int) Math.pow(2, power);
            }
            power++;
        }

        return dec_num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String str = sc.nextLine();

        System.out.println("Decimal number of "+str+" is: "+binaryToDecimal(str));
    }
}
