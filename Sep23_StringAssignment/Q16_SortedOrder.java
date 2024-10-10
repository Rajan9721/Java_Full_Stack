package Sep23_StringAssignment;

import java.util.Scanner;

public class Q16_SortedOrder {
    public static String sortedOrder(String str){
        char ch[] = str.toCharArray();
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){

                if(ch[i]>ch[j]){
                   char temp = ch[i];
                   ch[i] = ch[j];
                   ch[j] = temp;
                }
            }
            newStr += ch[i];
        }

        return newStr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for sorting: ");
        String str = sc.nextLine();

        System.out.println("After sorting string is: "+sortedOrder(str));
    }
}
