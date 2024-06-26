package Java;
// Word Pattern
// Given a pattern and a string s, find if s follows the same pattern.

import java.util.HashMap;
import java.util.Map;

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false
public class WordPattern {
    public static void main(String[] args) {
        String pattern ="abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern,String s){
        //Convert from string to string array
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        Map<String,Character> wordTopattern = new HashMap<>();
        Map<Character,String> patternToword = new HashMap<>();

        for(int i = 0;i < pattern.length();i++){
            char p = pattern.charAt(i);
            String w = words[i];

            if(patternToword.containsKey(p)){
                if(!patternToword.get(p).equals(w)){
                    return false;
                }
            }
            else{
                patternToword.put(p,w);
            }

            if(wordTopattern.containsKey(w)){
                if(!wordTopattern.get(w).equals(p)){
                    return false;
                }
            }
            else{
                wordTopattern.put(w,p);
            }
        }
        return true;
    }
}
