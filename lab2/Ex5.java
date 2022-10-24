package lab2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        int n = new Scanner(System.in).nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++){
            result += Math.pow(2, i);
        }
        System.out.println("The result is: " + result);
    }
}
