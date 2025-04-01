/*The majority element is the element that appears more than ⌊n / 2⌋ times  in a array.
Input: nums = [2,2,1,1,1,2,2]
Output: 2
we are using Boyer-Moore Voting Algorithm here - 
We choose the first person we see as our current "candidate" for majority
We give them 1 vote (count = 1)
Then for each new person:

If they support our candidate: add 1 vote
If they oppose our candidate: remove 1 vote


If votes reach 0, we choose the next person as our new candidate

*/

public class MajorityElement {
    public static void main(String[] args) {
        
        int[] arr = {2,2,1,2,1,2,1};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        int count = 0;
        int candidate = 0;

        for(int num : arr){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;

    }
}

