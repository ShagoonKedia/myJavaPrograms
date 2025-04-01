package Strings;
import java.util.Scanner;

public class RemoveWhiteSpace {
     public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string");

    String str = sc.nextLine();

    System.out.println(removeWhiteSpace(str));
        

    }
    public static String removeWhiteSpace(String s){

        StringBuilder builder = new StringBuilder();

        char[] ch = s.toCharArray();

        for(char c : ch){
            if(!Character.isWhitespace(c)){
                builder.append(c);
            }
        }
        return builder.toString();


    }
}
