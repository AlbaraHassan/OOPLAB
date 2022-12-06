package ThreeMemMonth;

import java.util.HashMap;

public class Month {
    private char firstLetter;
    private char secondLetter;
    private char thirdLetter;
    private HashMap<Integer, String> months = MapOfMonths.months();

    public Month(String monthForShort) {
        this.firstLetter = monthForShort.charAt(0);
        this.secondLetter = monthForShort.charAt(1);
        this.thirdLetter = monthForShort.charAt(2);
    }

    private HashMap<Integer, String> mapToMonth(String monthForShort) {
        HashMap<Integer, String> result = new HashMap<>();
        for (int i : this.months.keySet()) {
            if (this.months.get(i).toLowerCase().contains(monthForShort.toLowerCase())) {
                result.put(i, this.months.get(i));
                return result;
            }
        }
        return null;
    }

    public String toString() {
        return "Month: " + this.firstLetter + this.secondLetter + this.thirdLetter +
                (this.mapToMonth("" + this.firstLetter + this.secondLetter + this.thirdLetter) != null ?
                        " exists and is short for " + this.mapToMonth(""+ this.firstLetter + this.secondLetter + this.thirdLetter).values().toArray()[0]
                        : " Does not exist");
    }
}
