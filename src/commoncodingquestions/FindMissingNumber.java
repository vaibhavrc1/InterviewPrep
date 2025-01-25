package commoncodingquestions;

import java.util.Arrays;

public class FindMissingNumber {
//    Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array.
//    To find the missing number in an array containing distinct numbers taken from 0 to n, you can utilize the concept
//    of arithmetic progression and Gauss’s formula.

    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 5, 2, 6, 4};
        System.out.println(findMissingNumber2(nums));
    }

    public static int findMissingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return -1;
    }

    // Using sum of n natural number formula (Gauss's formula)
    public static int findMissingNumber2(int[] nums){
        int n  = nums.length - 1;
        int expectedSum = (n*(n + 1))/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        int difference = expectedSum - actualSum;
        if(difference == 0){
            return -1;
        }
        return difference;
    }
}
