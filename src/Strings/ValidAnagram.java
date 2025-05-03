package Strings;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
        
    }
    public static boolean isAnagram(String s, String t){

        int n = s.length();
        int m = t.length();

        int[] count = new int[26];   //count array for 26 alphabets to update the count character by character

        if(m != n){
            return false;
        }
        else{
            for(int i = 0; i < m; i++){
                count[s.charAt(i) - 'a']++;   //considering ASCII values for each alphabet and updating the count for that alphabet's index
            }                                 // here eg: 'g' - 'a' i.e 103 - 97
            
            for(int i = 0; i < n; i++){
                count[t.charAt(i) - 'a']--;   //here decreasing the same count for each alphabet to check if same set of aplhabets are present
            }
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;   // Time complexity is O(m+n)  => O(n)

    }

}
