package Sep23_StringAssignment;

import java.util.Scanner;

public class Q10_VowelCount {
    public static int vowelCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
                    || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Given String is: "+s);
        System.out.println();
        System.out.print("Number of vowel in given string is: "+vowelCount(s));
    }
}
