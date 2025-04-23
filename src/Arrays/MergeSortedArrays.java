package Arrays;
import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        
        int[] arr1 = {9,10,72,81};
        int[] arr2 = {1,3,999};

        int[] arr3 = merge(arr1, arr2);

        for(int num : arr3){
            System.out.print(num+" ");
        }


    }
    public static int[] merge(int[] arr1, int[] arr2){

        int m = arr1.length;
        int n = arr2.length;
        
        int[] arr3 = new int[m+n];

        int i = 0, j = 0, k = 0;

        while(i<m && j<n){
            if(arr1[i] <  arr2[j] ){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i<m){   //copying other elements if any
            arr3[k++] = arr1[i++]; 
        }
        while(j<n){    //copying other elements if any
            arr3[k++] = arr2[j++]; 
        }
        return arr3;
            
    }
        

        

}
