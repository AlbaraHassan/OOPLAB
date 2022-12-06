package MothersCounter;

public class Simulation {
    public static void main(String[] args) {
        Counter c = new Counter();
        for(int i = 0; i < 9; i++){
            c.incr1();
            c.incr10();
            c.incr100();
            c.incr1000();
        }
        c.incr1000();
        c.reset();
        c.incr1000();
    }
}
