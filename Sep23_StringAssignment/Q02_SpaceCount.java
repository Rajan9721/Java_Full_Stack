package Sep23_StringAssignment;


import java.util.Scanner;

public class Q02_SpaceCount {
    public static int spaceCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)== ' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println("Enter the sentence for count the spaces: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = spaceCount(s);
        System.out.println("In the given sentence spaces are: "+result);
    }
}
