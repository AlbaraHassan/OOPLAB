package lab3;

import java.util.ArrayList;

public class Ex7 {

    public static ArrayList<Integer> length(ArrayList<String> words){
        ArrayList<Integer> arr = new ArrayList<>();
        for(String i : words){
            arr.add(i.length());
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Bera");
        arr.add("World is big");
        arr.add("Hello to the world");
        arr.add("Goodbye people");
        System.out.println(length(arr));
    }
}
