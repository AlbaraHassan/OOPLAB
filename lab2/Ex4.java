package lab2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int from = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        int to = new Scanner(System.in).nextInt();
        while(from <= to){
            System.out.println(from);
            from++;
        }
    }
}
