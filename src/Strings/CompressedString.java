package Strings;

public class CompressedString {

    public static void main(String[] args) {

        char[] chars1 = {'a'};
        char[] chars2 = {'a', 'a', 'b', 'c', 'c', 'c'};

        System.out.println(compressedString(chars1));
        System.out.println(compressedString(chars2));


        
    }

    public static int compressedString(char[] chars){
        int read = 0;
        int write = 0;

        while(read < chars.length){
            char ch = chars[read];   // current character being evaluated
            int count = 0;

            while(read < chars.length && chars[read] == ch){  // until the consequent character is there
                read++;
                count++;
            }

            chars[write++] = ch;   // write the alphabet

            if(count > 1){
                String str = String.valueOf(count);
                for(char digit : str.toCharArray()){
                    chars[write++] = digit;   //write the digit
                }
            }

        }
        return write;

    }

}
