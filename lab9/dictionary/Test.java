package lab9.dictionary;

public class Test {
    public static void main(String[] args) {
        PersonalMultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");
        dict.add("pii", "silicon");
        dict.add("pii", "pi");
        System.out.println(dict.translate("kuusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));
    }
}
