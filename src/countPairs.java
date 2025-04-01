//Given n, find number of pairs of (a,b) such that a + b = n where a > 0 and b > 0. (Expected solution in O(1)).

public class countPairs {
    public static int countP(int n){
        if(n<=1){
            return 0;
        }
        else{
            return n-1;
        }
    }

    public static void printPairs(int n){
        if(n<=1){
            return;
        }
        for(int i=1;i<n;i++){
            System.out.println("("+i+","+(n-i)+")");
        }
    }

    public static void main(String args[]){
        int n=5;
        printPairs(n);
    }

}
