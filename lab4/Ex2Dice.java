package lab4;

import java.util.Random;

public class Ex2Dice {
    private Random random;
    private int numberOfSides;

    public Ex2Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }

    public int roll() {
        return this.random.nextInt(1, this.numberOfSides + 1);
    }
}
