package lab1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        if(new Scanner(System.in).nextInt() > 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }
    }
}
