package Strings.SlidingWindow;
import java.util.Arrays;

public class MinSubArrayLength {

    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("Input: " + Arrays.toString(nums) + " , " + target);
        System.out.println(minSubarray(target, nums));
        
    }
    public static int minSubarray(int target, int[] nums){

        if(nums == null || nums.length == 0){
            return 0;
        }
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }



}
