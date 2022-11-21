package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdWatchers {
    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Scanner reader){
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        this.birds.add(new Bird(name, latinName));
    }

    public void observe(Scanner reader){
        System.out.println("What was observed? ");
        String searched = reader.nextLine();
        for(Bird bird : this.birds){
            if(StringUtils.included(bird.getName(), searched) || StringUtils.included(bird.getLatinName(), searched)){
                bird.addObservation();
                return;
            }
        }
        System.out.println("Is Not a Bird!");
    }

    public void statistics(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }

    public void show(Scanner reader){
        System.out.println("What? ");
        String searched = reader.nextLine();
        for(Bird bird : this.birds){
            if(StringUtils.included(bird.getName(), searched) || StringUtils.included(bird.getLatinName(), searched)){
                System.out.println(bird);
            }
        }

    }
}
