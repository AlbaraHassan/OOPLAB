package lab6;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        BirdWatchers db = new BirdWatchers();
        Scanner reader = new Scanner(System.in);
        loop: while(true) {
            System.out.print("? ");
            String option = reader.nextLine();
            switch (option.toLowerCase().trim()) {
                case "add" -> db.addBird(reader);
                case "observation" -> db.observe(reader);
                case "statistics" -> db.statistics();
                case "show" -> db.show(reader);
                case "quit" -> {break loop;}
            }
        }
    }
}
