package Strings;

public class IndexOfFirstOccurence {

    public static void main(String[] args) {
        
        System.out.println(strStr("sadbutsad","sad"));
    }

    public static int strStr(String hayStack, String needle){

         for(int i = 0; i < hayStack.length() - needle.length() + 1; i++){  

            if(hayStack.charAt(i) == needle.charAt(0)){    // check if first element of needle is present in haywatch
                if((hayStack.substring(i,needle.length()+i).equals(needle))){    //check if substring of hatstack is equal to needle 
                                                                                 //In this case, substring of (3,6)
                    return i;

                }
            }

         }
         return -1;

    }

}
