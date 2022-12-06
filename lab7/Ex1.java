package lab7;

import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("matti", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");

        System.out.println(names.get("matti"));
    }
}
