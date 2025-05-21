package Stacks;

import java.util.Stack;

public class ReversePolishNotaion {

    public static void main(String[] args) {

        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(tokens));
        
    }

    public static int evalRPN(String[] tokens){

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int op2 = stack.pop();
                int op1 = stack.pop();

                switch(token){
                    case "+" : stack.push(op1 + op2); break;

                    case "-" : stack.push(op1 - op2); break;

                    case "*" : stack.push(op1 * op2); break;

                    case "/" : stack.push(op1 / op2); break;
                }
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }

        if(stack.size() != 1){

            throw new IllegalArgumentException("Invalid RPN");

        }

        return stack.pop();

    }



}
