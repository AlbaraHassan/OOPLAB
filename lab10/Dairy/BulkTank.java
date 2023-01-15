package lab10.Dairy;

import java.util.ArrayList;

public class BulkTank {

    private double capacity;
    private double volume;
    public BulkTank(){
        this(2000);
    }
    public BulkTank(double capacity) {
        this.capacity = capacity;
    }


    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }
    public void addToTank(double amount){
        if(this.volume + amount < this.capacity ) this.volume += amount;
        else this.volume = this.capacity;
    }

    public void getFromTank(double amount){
        if(this.volume - amount > 0 ) this.volume -= amount;
        else this.volume = 0;
    }

    @Override
    public String toString(){
        return this.volume + "/" + this.capacity;
    }

}
