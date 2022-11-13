package lab4;

public class Ex2 {
    public static void main(String[] args) {
        Ex2Dice dice = new Ex2Dice(6);
        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}
