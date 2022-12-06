package lab7;

import java.util.Locale;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    private void add() {
        System.out.print("In Finnish: ");
        String finish = reader.nextLine().toLowerCase();
        System.out.print("In English: ");
        String english = reader.nextLine().toLowerCase();
        this.dictionary.add(finish, english);
    }

    private void translate(){
        System.out.print("Give a word: ");
        System.out.println("Translation: " + this.dictionary.translate(reader.nextLine().toLowerCase()));
    }

    public void start() {
        System.out.println("Statments:\n add - adds a word pair to the dictionary\n trasnlate - asks a word and prints its translation\n quit - quit the text user interface\n");
        loop:
        while (true) {
            System.out.print("Statment: ");
            String option = reader.nextLine().toLowerCase();
            switch (option) {
                case "add" -> this.add();
                case "translate" -> this.translate();
                case "quit" -> {
                    System.out.println("Cheers!");
                    break loop;
                }
                default -> System.out.println("Unknown Statement !");
            }
        }
    }
}
