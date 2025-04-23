package Strings;

public class IndexOfFirstOccurence {

    public static void main(String[] args) {
        
        System.out.println(strStr("sadbutsad","sad"));
    }

    public static int strStr(String hayStack, String needle){

         for(int i = 0; i < hayStack.length() - needle.length() + 1; i++){   // run the loop o

            if(hayStack.charAt(i) == needle.charAt(0)){
                if((hayStack.substring(i,needle.length()+i).equals(needle))){

                    return i;

                }
            }

         }
         return -1;

    }

}
