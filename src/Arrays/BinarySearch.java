package Arrays;
public class BinarySearch {
    public static void main(String[] args){

        int[] arr = {-18, 0, 2, 9, 12, 24, 49, 108, 251};
        int target = 251;

        System.out.println(binaryS(arr, target));
        
    }

    static int binaryS(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            
            int mid = start+(end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){

                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
        

    }
    

}
