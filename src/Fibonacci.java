import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int count = sc.nextInt();

        // int a = 0;
        // int b = 1;
        // for (int i = 0; i < count; i++) {

            
        //     System.out.print(a + " ");
        //     int c = a + b;	
        //     a = b;
		// 	b = c;
			
		// }


        for(int i =0; i < count; i++){
            System.out.print(fib(i)+" ");
        }

	}

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
} 

