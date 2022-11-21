package lab6;

public class Ex3 {
    public static int indexOfTheSmallestStartingFrom(int[] arr, int from){
        int smallestIndex = from;
        for(int i = smallestIndex; i < arr.length; i++){
            if(arr[i] < arr[smallestIndex]) smallestIndex = i;
        }
        return smallestIndex;
    }
    public static void main(String[] args) {
        int[] values= {6,5,8,7,11};
        System.out.println("Index of the smallest: " + indexOfTheSmallestStartingFrom(values, 1));
        System.out.println("Index of the smallest: " + indexOfTheSmallestStartingFrom(values, 2));
        System.out.println("Index of the smallest: " + indexOfTheSmallestStartingFrom(values, 4));
    }
}
