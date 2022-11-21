package lab6;

public class Ex2 {
    public static int indexOfTheSmallest(int[]arr){
        int smallestIndex = 0;
        for(int i = smallestIndex; i < arr.length; i++){
            if(arr[i] < arr[smallestIndex]) smallestIndex = i;
        }
        return smallestIndex;
    }
    public static void main(String[] args) {
        int[] values= {6,5,8,7,11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
    }
}
