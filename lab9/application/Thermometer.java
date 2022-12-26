package lab9.application;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean state;

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if(this.state) return new Random().nextInt(-30, 30);
        else throw new IllegalStateException("Sensor is not on!");
    }
}
