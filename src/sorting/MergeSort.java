package sorting;

import java.util.Arrays;

//Time complexity : O(nlog(n))
//Space complexity : O(nlog(n))
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 34, 5, 3, 20, -1}; // -1, 1, 3, 5, 20, 34
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Divide the array in two parts
    public static void mergeSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int index = 0;
        int length = arr.length;
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for(int i = 0; i < left.length; i++){
            left[i] = arr[index++];
        }

        for(int i = 0; i < right.length; i++){
            right[i] = arr[index++];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    // Merge two sorted arrays
    public static void merge(int[] arr, int[] left, int[] right){
        int leftIndex = 0, rightIndex = 0, index = 0;

        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                arr[index++] = left[leftIndex++];
            }
            else{
                arr[index++] = right[rightIndex++];
            }
        }

        while(leftIndex < left.length){
            arr[index++] = left[leftIndex++];
        }

        while(rightIndex < right.length){
            arr[index++] = right[rightIndex++];
        }
    }
}
