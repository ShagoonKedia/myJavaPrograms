import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == isPalin(num)){
            System.out.println("yes");
        }
        System.out.println();
    }

    public static int isPalin(int num){

        int rev = 0;
        while(num != 0){

           rev = rev*10 + num%10;
           num /= 10;

        
        }
        return rev;
        
        
    }

}
