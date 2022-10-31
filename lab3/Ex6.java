package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        String word;
        while(true){
            System.out.print("Enter a word: ");
            word = reader.nextLine();
            if(array.contains(word)) break;
            array.add(word);
        }

        System.out.println("You gave the word " + word + " twice");
        Collections.sort(array);
        System.out.println("All words in alphabetical order: ");
        for(String i : array){
            System.out.println(i);
        }
    }
}
