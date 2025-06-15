package Arrays;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;

        System.out.println(hasTripletSum(arr, target));
          
    }

    public static boolean hasTripletSum(int[] arr, int target){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i<n-2;i++){
            int l = i+1, r = n-1;
            
            int sum = target-arr[i];
            while(l<r){
                if(arr[l] + arr[r] == sum){
                    return true;
                }
                if(arr[l]+arr[r] < sum){
                    l++;
                }
                else if(arr[l]+arr[r] > sum){
                    r--;
                }
            }
            
        }
    
    return false;
}
}


