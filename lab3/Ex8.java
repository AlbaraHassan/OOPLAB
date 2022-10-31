package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
    public static String getReverse(String word){
        String res = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            res += word.charAt(i);
        }
        return res;
    }

    public static void isPalindrome(String word, String reversed){
        if(word.equals(reversed)) System.out.println("The text is a palindrome");
        else System.out.println("The text is not a palindrome");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = reader.nextLine();
        isPalindrome(word ,getReverse(word));
    }
}
