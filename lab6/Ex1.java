package lab6;

public class Ex1 {
    public static int smallest(int[] arr){
        int smallest = arr[0];
        for(int i : arr){
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] values= {6,5,8,7,11};
        System.out.println("Smallest: " + smallest(values));
    }
}
