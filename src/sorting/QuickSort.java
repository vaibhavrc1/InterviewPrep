package sorting;

import java.util.Arrays;

//Time complexity : O(nlog(n))
//Space complexity : O(nlog(n))
//In-place algorithm
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 34, 5, 3, 20, -1}; // -1, 1, 3, 5, 20, 34
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Check the range and call the quicksort method
    public static void quickSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }

        quickSort(arr, 0, arr.length - 1);
    }

    // Find the partition index and call itself recursively
    public static void quickSort(int[] arr, int start, int end){
        if(start > end){
            return;
        }
        int pi = partition(arr, start, end);

        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    // Find the partition index (complex)
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
