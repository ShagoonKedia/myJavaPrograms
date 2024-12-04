import java.util.Scanner;

public class countDigit {
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        
        num = Math.abs(num);
        if(num == 0){
            count = 1;
        }
   
        while (num  != 0){
            num/=10;
            count++;
        }

        System.out.println(count);
        
    }

}
