package lab2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String password = "StrongPassword";
        while (true) {
            System.out.print("Type the password: ");
            String enteredPassword = new Scanner(System.in).nextLine();
            if (password.equals(enteredPassword)) {
                System.out.println("Right!");
                break;
            } else {
                System.err.println("Wrong!");
            }
        }
    }
}
