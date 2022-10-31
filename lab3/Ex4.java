package lab3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        for (int i = name.length() - 1; i >= 0 ; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
