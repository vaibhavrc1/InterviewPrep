package search;

import java.util.Arrays;

//Time complexity : O(log(n))
//Space complexity : O(1)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 2, 0, arr.length - 1)); //1
        System.out.println(binarySearch(arr, 7, 0, arr.length - 1)); //6
        System.out.println(binarySearch(arr, 4, 0, arr.length - 1)); //3
        System.out.println(binarySearch(arr, 9, 0, arr.length - 1)); //8
        System.out.println(binarySearch(arr, 11, 0, arr.length - 1)); //-1
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
            return binarySearch(arr, target, start, mid - 1);
        }
        else{
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}
