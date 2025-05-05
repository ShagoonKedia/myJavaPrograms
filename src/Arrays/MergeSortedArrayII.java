package Arrays;

public class MergeSortedArrayII {

    public static void main(String[] args) {

        int[] arr1 = {9,10,72,81,0,0,0};
        int[] arr2 = {1,3,999};

        int m = 4, n = 3;

        merge(arr1, m, arr2, n);

        for(int num : arr1){
            System.out.print(num+" ");
        }
        
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){ // 3 pointers approach
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

}
