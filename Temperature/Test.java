package Temperature;

public class Test {
    public static void main(String[] args) {
        Temperature temp = new Temperature();

        temp.setTempCelsius(30);
        System.out.println(temp);
        temp.setTempKelvin(30);
        System.out.println(temp);
        temp.setTempFahrenheit(30);
        System.out.println(temp);
    }
}
