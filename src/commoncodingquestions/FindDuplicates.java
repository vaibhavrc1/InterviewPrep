package commoncodingquestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    //Given an array of integers, find the duplicate numbers.
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 5};
        System.out.println(findDuplicates(nums));
    }

    public static Set<Integer> findDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
