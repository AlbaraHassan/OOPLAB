package lab2;

import java.util.Scanner;

public class Ex8 {
    public static int drawNumber() {
        return (int) (Math.random() * 100); // returns random number between 0 and 100
    }

    public static void main(String[] args) {
        int number = drawNumber();
        int guess, count = 0;
        while (true) {
            System.out.print("Guess the number: ");
            guess = new Scanner(System.in).nextInt();
            count++;
            if (guess > number) System.out.println("The number is lesser!");
            else if (guess < number) System.out.println("The number is greater!");
            else {
                System.out.println("Congratulations, your number is correct!");
                break;
            }
        }
        System.out.println("Number of guesses: " + count);
    }
}
