package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondHighest {
    public static void main(String args[]){
        int[] arr = {1,0,89,2,11};
        System.out.println(secondHigh(arr));
    }

    public static int secondHigh(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
             list.add(i);
        }
         Collections.sort(list);

         return list.get(list.size() - 2);

        
    }

}
