package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<>();
    }

    public String translate(String word) {
        return this.dict.get(word) != null ? this.dict.get(word) : "null";
    }

    public void add(String key, String value) {
        this.dict.put(key, value);
    }

    public int amountOfWords() {
        return this.dict.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> arr = new ArrayList<>();
        for (String key : this.dict.keySet()) {
            arr.add(key + " = " + this.dict.get(key));
        }
        return arr;
    }
}
