package Sep23_StringAssignment;

import java.util.Scanner;

public class Q25_CompareTwoString {
    public static int stringCompare(String str1,String str2)
    {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {

            if (str1.charAt(i) == str2.charAt(i)) {
                continue;
            }
            else {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        }
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String str1 = sc.nextLine();

        System.out.println("Enter string1: ");
        String str2 = sc.nextLine();

        int res = stringCompare(str1, str2);
        if(res==0){
            System.out.println("Both Strings are equals. : "+res);
        }else if(res<0){
            System.out.println("String1 is less than string2. : "+res);
        }else{
            System.out.println("String1 is bigger than string2. : "+res);
        }

    }
}
