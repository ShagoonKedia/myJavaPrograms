package Strings;

public class CountChar {
    public static void main(String[] args){
        String str = "Hello World";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);

    }

}




