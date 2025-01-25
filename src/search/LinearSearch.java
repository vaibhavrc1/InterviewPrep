package search;

//Time complexity : O(n)
//Space complexity : O(1)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 34, 5, 3, 20, -1};
        System.out.println(linearSearch(arr, 5));// 2
        System.out.println(linearSearch(arr, -1));// 5
        System.out.println(linearSearch(arr, 4));// -1
    }

    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}

