package lab10.Dairy;

import java.util.Random;

public class Helper {
    public static String randomName() {
        String[] NAMES = new String[]{
                "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki", "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
        };

        return NAMES[new Random().nextInt(NAMES.length)];
    }
}
