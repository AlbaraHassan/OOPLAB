package lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Number of characters: " + reader.nextLine().length());
    }
}
