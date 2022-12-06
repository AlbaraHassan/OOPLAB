package Month;

import java.util.HashMap;

public class Month {
    private String monthString;
    private HashMap<Integer, String> months = MapOfMonths.months();
    private int monthNumber;
    public Month(int monthNumber){
        this.monthNumber = monthNumber;
        this.monthString = this.mapToMonth(monthNumber);
        }

    public Month(String monthForShort){
        this.monthNumber = (int) this.mapToMonth(monthForShort).keySet().toArray()[0];
        this.monthString = (String) this.mapToMonth(monthForShort).values().toArray()[0];
    }
    private String mapToMonth(int monthNumber){
        return this.months.get(monthNumber);
    }
    private HashMap<Integer, String> mapToMonth(String monthForShort){
        HashMap<Integer, String> result = new HashMap<>();
        for(int i : this.months.keySet()){
            if(this.months.get(i).toLowerCase().contains(monthForShort.toLowerCase())){
                result.put(i, this.months.get(i));
                return result;
            }
        }
        return null;
    }

    public String getMonthForShort(){
        return this.monthString.substring(0, 3);
    }

    public int getMonthNumber(){
        return this.monthNumber;
    }

    public Month getNextMonth(){
        if(this.monthNumber+1 <= 12) return new Month(this.monthNumber + 1);
        return new Month(1);
    }
}
