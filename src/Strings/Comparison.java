package Strings;
import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str1 = new String("kunal");
    String str2 = new String("kunal");

    System.out.println(str1 == str2);

    String str3 = "Kunal";
    str3 = "shagun";
    String str4 = "Kunal";
    String str5 = str3;

    System.out.println(str3 == str4);
    System.out.println(str5 == str4);
    

    Integer a = 126;
    
    if (a == 502){
        System.out.println("hello");
    } else {
        System.out.println("No hello");
    }
    
    }

}
