public class Reverse {

    public static void main(String args[]){
        String str = " hjabkbbshgwqvsjqb";
        System.out.println(reverseString(str));

    }

    public static String reverseString(String in){
        if(in == null){
            throw new IllegalArgumentException("Null is not a valid string");
        }

        char[] ch = in.toCharArray();
        StringBuilder out = new StringBuilder();

        for(int i=ch.length - 1; i>=0; i--){
            out.append(ch[i]);
        }
        return out.toString();
    }
}
