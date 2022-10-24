package lab2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int sum = 0;
        while(true){
            int number = new Scanner(System.in).nextInt();
            if (number == 0) break;
            sum += number;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}
