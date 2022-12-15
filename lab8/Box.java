package lab8;

import java.util.ArrayList;

public class Box {
    private double maxWeight;
    private ArrayList<ToBeStored> items;

    public Box(double maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored item) {
        if (this.totalWeight() + item.weight() <= this.maxWeight) this.items.add(item);
        else System.out.println("The box is full!!!");
    }

    private double totalWeight() {
        double total = 0;
        for (ToBeStored item : this.items) {
            total += item.weight();
        }
        return total;
    }


    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.totalWeight();
    }
}
