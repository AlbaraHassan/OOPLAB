package lab6;

public class Ex7 {
    public static void main(String[] args) {
        NightSky nightSky = new NightSky(0.1,40,10);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
    }
}
