package lab6;

public class Ex6 {
    public static void printElegantly(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + (i != arr.length-1?", ":" "));
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printElegantly(arr);
    }
}
