package lab1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNum = reader.nextInt();
        System.out.print("Enter another number: ");
        int secondNum = reader.nextInt();
        System.out.println("Sum of the number: " + firstNum + secondNum);
    }
}
