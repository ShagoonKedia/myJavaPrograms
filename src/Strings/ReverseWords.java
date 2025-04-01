package Strings;
public class ReverseWords {
    public static void main(String args[]){
        String str = " The Sky is pink ";
        System.out.println(reverseString(str));

    }

    public static String reverseString(String in){
        if(in == null){
            throw new IllegalArgumentException("Null is not a valid string");
        }

        String[] words = in.trim().split("\\s+");
        StringBuilder out = new StringBuilder();

        for(int i=words.length - 1; i>=0; i--){
            out.append(words[i]);
            if(i>0){
                out.append(" ");
            }
        }
        return out.toString();
    }

}
