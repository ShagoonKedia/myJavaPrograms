package Strings;
import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();
        char ch;
        int count = 0;

        

    //     if(input.toLowerCase().matches(".*[aeiou].*")){
           
    //         System.out.println("Vowel is present");
    //     }
    //     else {
    //         System.out.println("Vowel is not present");
    //     }
    // }

    for(int i = 0; i < input.length(); i++){
        ch = input.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
    }
    if(count > 0){
        System.out.println(count + " Vowels are present");
    }
    else {
        System.out.println("Vowel is not present");
    }
    
}
}



