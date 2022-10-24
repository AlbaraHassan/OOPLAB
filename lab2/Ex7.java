package lab2;

public class Ex7 {
    public static void printStart(int numberOfStars){
        for(int i = 0; i < numberOfStars; i++) System.out.print("*");
        System.out.print("\n");
    }
    public static void main(String[] args) {
        printStart(4);
        printStart(2);
        printStart(1);
    }
}
