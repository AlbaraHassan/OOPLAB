package lab9.application;

public class Test {
    public static void main(String[] args) {
        Sensor s1 = new Thermometer();
        s1.on();
        System.out.println("The temperature of s1 is " + s1.measure() + " degrees");
        Sensor s2 = new Thermometer();
        Sensor s3 = new Thermometer();
        AverageSensor averageSensor = new AverageSensor();
        averageSensor.addSensor(s1);
        averageSensor.addSensor(s2);
        averageSensor.addSensor(s3);
        averageSensor.on();
        System.out.println("The temperature in averageSensor is " + averageSensor.measure() + " degrees");
        System.out.println("The temperature in averageSensor is " + averageSensor.measure() + " degrees");
        System.out.println("The temperature in averageSensor is " + averageSensor.measure() + " degrees");
        System.out.println("Readings: " + averageSensor.readings());
    }
}
