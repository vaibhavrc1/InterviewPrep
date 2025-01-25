package commoncodingquestions;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        //Write a Java function to find the contiguous subarray within an array that has the largest sum.
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array of numbers
        System.out.println(maximumSubArraySum(nums));
    }

    public static int maximumSubArraySum(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
