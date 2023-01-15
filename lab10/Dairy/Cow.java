package lab10.Dairy;

import java.util.Random;

public class Cow implements Alive, Milkable{

    private String name;
    private double amount;
    private int udderCapacity;

    public Cow() {
        this(Helper.randomName());
    }

    public Cow(String name) {
        this.name = name;
        this.udderCapacity = new Random().nextInt(15, 40);
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udderCapacity;
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public void liveHour() {
        this.amount += new Random().nextInt(1, 2);
    }

    @Override
    public void milk() {
        this.amount = 0;
    }

    @Override
    public String toString(){
        return this.name + " " + this.amount + "/" + this.udderCapacity;
    }
}
