package Strings;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string");

    String str = sc.nextLine();

    System.out.println(palindrome(str));
        

    }
    public static boolean palindrome(String s){
        int n = s.length();
        boolean result = true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                result =  false;
                break;
            }
        }
        return result;
    }
}
