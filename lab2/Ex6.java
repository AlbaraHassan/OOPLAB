package lab2;

import java.util.Scanner;

public class Ex6 {
    public static void printText(int timesOfPrinting){
        for(int i = 0; i < timesOfPrinting; i++) System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void main(String[] args) {
        System.out.print("Enter the number for the message to be printed: ");
        printText(new Scanner(System.in).nextInt());
    }
}
