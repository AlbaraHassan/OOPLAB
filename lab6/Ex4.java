package lab6;

import java.util.Arrays;

public class Ex4 {
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6};
        swap(values, 1,2);
        System.out.println(Arrays.toString(values));
    }
}
