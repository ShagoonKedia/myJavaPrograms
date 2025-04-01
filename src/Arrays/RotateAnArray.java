package Arrays;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
import java.util.*;
public class RotateAnArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        rotatedArray(arr, k);
    }

    public static void rotatedArray(int[] arr, int k){
        
        int n = arr.length;
        k = k % n;

        if(k == 0){
            return;
        }

        reverse(arr, 0, n-1);

        reverse(arr, 0, k-1);

        reverse(arr, k, n-1);

        /*for (int i : arr) {
            System.out.println(i);
            
        } */
       System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
