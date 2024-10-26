package Sep23_StringAssignment;

import java.util.Scanner;

public class Q15_SingleOccurrence {
    public static String singleOccurrence(String s){
            StringBuilder sb = new StringBuilder(s.length());
//            String newStr = "";
            boolean[] seen = new boolean[256];

            // Traverse through all characters
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // Check if s[i] is present before it
                if (!seen[c]) {
                    sb.append(c);
//                    newStr = newStr+c;
                    seen[c] = true;
                }
            }

            return sb.toString();
//            return newStr;
    }

    public static String removeConsecutive(String s)
    {

        // Initialize start and stop pointers
        int i = 0;
        int j = 0;

        // Initialize an empty string for new elements
        String newElements = "";

        // Iterate string using j pointer
        while (j < s.length()) {

            // If both elements are same then skip
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            // If both elements are not same then append new
            // element
            else if (s.charAt(j) != s.charAt(i) || j == s.length() - 1) {

                newElements += s.charAt(i);
                // After appending, slide over the window
                i = j;
                j++;
            }
        }

        // Append the last string
        newElements += s.charAt(j - 1);

        return newElements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("New String is: "+removeConsecutive(str));

        System.out.println("Single Occurrence: "+singleOccurrence(str));
    }
}
