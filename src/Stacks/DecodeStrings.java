package Stacks;

import java.util.Stack;

public class DecodeStrings {

    public static void main(String[] args) {

        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
        
    }

    public static String decodeString(String s){

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        int k = 0;
        StringBuilder currentString = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                countStack.push(k);
                stringStack.push(currentString);

                k = 0;
                currentString = new StringBuilder();
            }
            else if(ch == ']'){
                int count = countStack.pop();
                StringBuilder temp = stringStack.pop();

                for(int i = 0; i < count; i++){
                    temp.append(currentString);
                }

                currentString = temp;               
            }
            else{
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }

}
