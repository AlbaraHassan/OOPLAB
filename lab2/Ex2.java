package lab2;

import java.util.Scanner;

public class Ex2 {
    public static int requestNumber(String text){
        Scanner reader = new Scanner(System.in);
        System.out.print(text);
        return reader.nextInt();
    }
    public static int calculateSub(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {requestNumber("Enter the first number: "),
                         requestNumber("Enter the second number: "),
                         requestNumber("Enter the third number: ")};

        System.out.println("Sum: " + calculateSub(numbers) );
    }
}
