public class Selection {
    public static void main(String args[]){
        int arr[]  = {9,2,7,11,1,56,0};
        
        //Selection sort
        for (int i = 0;i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){

                if(arr[smallest] > arr[j]){
                    smallest = j;
                    //swap
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
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
