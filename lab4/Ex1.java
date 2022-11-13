package lab4;

import java.util.ArrayList;

public class Ex1 {

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        array1.add(1);
        array1.add(14);
        array1.add(3);
        array1.add(2);
        array2.add(1);
        array2.add(14);
        array2.add(3);
        array2.add(2);
        combine(array1, array2);
        System.out.println(array1);
    }
}
