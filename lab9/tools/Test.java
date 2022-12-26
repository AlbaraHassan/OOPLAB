package lab9.tools;

public class Test {
    public static void main(String[] args) {
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");
        System.out.println(remover.getNumberOfDetectedDuplicates());
        remover.add("last");
        remover.add("last");
        remover.add("new");
        System.out.println(remover.getNumberOfDetectedDuplicates());
        System.out.println(remover.getUniqueCharacterStrings());
        remover.empty();
        System.out.println(remover.getNumberOfDetectedDuplicates());
        System.out.println(remover.getUniqueCharacterStrings());
    }
}
