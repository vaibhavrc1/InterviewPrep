package sorting;

import java.util.Arrays;

//Time complexity : O(n^2)
//Space complexity : O(1)
// Find minIndex with inner loop and swap with first value of outer loop
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 34, 5, 3, 20, -1}; // -1, 1, 3, 5, 20, 34
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
