package lab9.tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
    private ArrayList<String> strings = new ArrayList<>();
    private int duplicateNumber;

    @Override
    public void add(String characterString) {
        strings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        this.duplicateNumber = 0;
        for(int i = 0; i < this.strings.size(); i++){
            for(int j = i + 1; j < this.strings.size(); j++){
                if(this.strings.get(i).equals(this.strings.get(j))) {
                    this.duplicateNumber++;
                    break;
                }
            }
        }
        return this.duplicateNumber;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return new HashSet<>(this.strings);
    }

    @Override
    public void empty() {
        this.strings = new ArrayList<>();
    }
}
