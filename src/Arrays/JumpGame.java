package Arrays;

public class JumpGame {

    public static void main(String[] args) {

        int[] prices = {3,2,1,0,4};

        System.out.println(canJump(prices));
        
    }

    public static boolean canJump(int[] nums){

        int lastPos = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] + i >= lastPos){ 
            lastPos = i;
            }
        }
        return lastPos == 0; // returns true only if above block execution completes successfully

    }

}
