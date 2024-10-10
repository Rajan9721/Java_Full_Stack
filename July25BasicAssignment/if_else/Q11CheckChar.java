package if_else;

import java.util.Scanner;

public class Q11CheckChar {

    public static void checkChar(char ch){
        if(ch>='A' && ch<='Z'){
            System.out.println(ch+" is in Uppercase character.");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(ch+" is in lowercase latter.");
        }else{
            System.out.println(ch+" is not a alphabetic character.");
        }
    }
    public static void main(String[] args) {
        char ch = 'A';
        checkChar(ch);

        char ch2 = 'a';
        checkChar(ch2);

        char ch3 = '0';
        checkChar(ch3);

    }
}
