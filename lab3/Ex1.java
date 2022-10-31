package lab3;

public class Ex1 {
    public static double average(int[] numbers){
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        return  (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 3, 6, 1};
        System.out.println("The average is: " + average(numbers));
    }
}
