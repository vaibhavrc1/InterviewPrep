package commoncodingquestions;

import java.util.*;

public class DetectDuplicateElements {

//    Write a Java program to find all duplicate elements in an array.
//    To detect duplicate elements in an array in Java, you can use various approaches such as using a HashSet,
//    sorting the array, or using nested loops.

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3}; // Example array with duplicates
        System.out.println(findDuplicateElements1(nums));
        System.out.println(findDuplicateElements2(nums));
    }

    public static List<Integer> findDuplicateElements1(int[] nums){
        Arrays.sort(nums);
        List<Integer> duplicateElements = new ArrayList<>();

        int previousNumber = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == previousNumber){
                duplicateElements.add(nums[i]);
            }
            previousNumber = nums[i];
        }
        return duplicateElements;
    }

    public static List<Integer> findDuplicateElements2(int[] nums){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                duplicateElements.add(num);
            }
        }

        return new ArrayList<>(duplicateElements);
    }
}
