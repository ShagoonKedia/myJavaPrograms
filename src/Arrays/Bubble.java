package Arrays;
public class Bubble {

    public static void main(String args[]){
        int arr[]  = {9,2,7,11,1,56,0};
        
        //Bubble sort
        for (int i = 0;i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printfn(arr);

    }

    public static void printfn(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    

}
