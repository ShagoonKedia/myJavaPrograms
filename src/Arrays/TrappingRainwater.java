package Arrays;
public class TrappingRainwater {

    public static void main(String[] args){

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));

    }

    public static int trap(int[] height){

        if(height == null || height.length < 3){
            return 0;
        }

        int l = 0, r = height.length - 1;  // Two pointers approach
        int lmax = 0, rmax = 0;
        int water = 0;

        while(l < r){

            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if(lmax < rmax){
                water += lmax - height[l];
                l++;
            }
            else{
                water += rmax - height[r];
                r--;
            }
        }
        return water;


    }

}
