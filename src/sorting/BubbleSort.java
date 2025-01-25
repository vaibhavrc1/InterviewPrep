package sorting;

import java.util.Arrays;

//Time complexity : O(n^2)
//Space complexity : O(1)
// Greatest element goes at the end with each iteration
// Swap only adjacent elements
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 34, 5, 3, 20, -1}; // -1, 1, 3, 5, 20, 34
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
