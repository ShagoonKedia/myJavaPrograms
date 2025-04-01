package Strings;

public class SwapStrings {

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "XYZ";

        s1 = s1+s2;

        s2 = s1.substring(0,(s1.length() - s2.length()) );

        s1 = s1.substring(s2.length());

        System.out.println("s1 = " + s1 + "\n" + "s2 = " + s2);
    }

}
