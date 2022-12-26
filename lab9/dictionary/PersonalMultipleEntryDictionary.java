package lab9.dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonalMultipleEntryDictionary {
    private HashMap<String, ArrayList<String>> entries = new HashMap<>();

    public void add(String key, String value){
        if(this.entries.get(key) != null){
            this.entries.get(key).add(value);
        }
        else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(value);
            this.entries.put(key, arr);
        }
    }
    public ArrayList<String> translate(String word){
        return this.entries.get(word);
    }

    public void remove(String word){
        this.entries.remove(word);
    }
}
