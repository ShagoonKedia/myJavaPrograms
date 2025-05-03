package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(strs));
        
    }

    public static List<List<String>> groupAnagram(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList<>();

        }

        Map<String, List<String>> map = new HashMap<>();

        // count frequency of each letter in each word in the string array
        
        for(String s : strs){  //For every word in the array
            int[] count = new int[26];
            for(char c : s.toCharArray()){ 
                count[c - 'a']++; // c - 'a' calculates the array index for character c,'a' - 'a' = 0, 'b' - 'a' = 1, etc and incremets the count for each letter
            }

            // Build the key using character counts

            StringBuilder keyBuilder = new StringBuilder();

            for(int i = 0; i<26; i++){
                if(count[i] > 0){
                    keyBuilder.append((char)'a'+i).append(count[i]);
                }
            }

            String key = keyBuilder.toString();

            // add to Map

            if(!map.containsKey(key)){   // checks if hasmap already has a list for this specific key
                map.put(key, new ArrayList<>()); //If the key doesn't exist, we create a new ArrayList to hold strings with this anagram pattern
            }                                    // put() method inserts a key-value pair into the HashMap

            map.get(key).add(s);         //map.get(key) retreives the list assocaited with this key and adds the current string to the list
        }
        return new ArrayList<>(map.values());

    }

}
