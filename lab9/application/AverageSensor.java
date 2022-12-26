package lab9.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();


    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) return false;
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) sensor.on();
        }
    }

    @Override
    public void off() {
        Random random = new Random();
        int limit = random.nextInt(0, sensors.size());
        for (int i = 0; i < limit; i++) sensors.get(random.nextInt(0, sensors.size())).off();
    }

    @Override
    public int measure() {
        if (!this.isOn()) throw new IllegalStateException("One or all sensors are off!");
        int reading = this.sum()/this.sensors.size();
        this.readings.add(reading);
        return reading;
    }

    public List<Integer> readings(){
        return this.readings;
    }

    private int sum() {
        int sum = 0;
        for (Sensor sensor : this.sensors){
            sum += sensor.measure();
        }
        return sum;
    }
}
