package Strings.SlidingWindow;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args){
        String s = "abcabbdbbc";
        System.out.println("Input: " + s);
        
        Result result = nonRepeatingSubstring(s);
        System.out.println("Length: " + result.length);
        System.out.println("Substring: \"" + result.substring + "\"");
    }
    // we are using a static nested class here to return both values here, because java method can return only one value.
    // Created a simple container class to hold both values!
    // Helper class to return both length and substring
    static class Result {
        int length;
        String substring;
        
        Result(int length, String substring) {
            this.length = length;
            this.substring = substring;
        }
    }
    
    public static Result nonRepeatingSubstring(String s){
        if(s == null || s.length() == 0){
            return new Result(0, "");
        }
        
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int bestStart = 0;  // Track where the longest substring starts
        
        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            
            while(seen.contains(currentChar)){
                seen.remove(s.charAt(left));
                left++;
            }
            
            seen.add(currentChar);
            
            // Update if we found a longer substring
            if(right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                bestStart = left;  // Remember where it starts
            }
        }
        
        String longestSubstring = s.substring(bestStart, bestStart + maxLength);
        return new Result(maxLength, longestSubstring);
    }
}