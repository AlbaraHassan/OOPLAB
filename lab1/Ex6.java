package lab1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = reader.nextInt();

        //This is ugly but it works
        System.out.println(
                (
                        firstNumber == secondNumber
                ?
                "The numbers are equal"
                :
                (
                        firstNumber > secondNumber
                        ?
                        "The greater number: "
                                +
                                firstNumber
                        :
                        "The greater number: "
                                +
                                secondNumber
                )
        )
        )
        ;
    }
}
