package Java;

import java.util.HashSet;
import java.util.Set;
// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

// Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

// Example 1:

// Input: s = "leetcode", wordDict = ["leet","code"]
// Output: true
// Explanation: Return true because "leetcode" can be segmented as "leet code".
// Example 2:

// Input: s = "applepenapple", wordDict = ["apple","pen"]
// Output: true
// Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
// Note that you are allowed to reuse a dictionary word.
// Example 3:

// Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
// Output: false
public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;
        for(int i = 0;i < s.length();i++){
            if(t[i] == false){
                continue;
            }
            for(String x:dict){
                int len = x.length();
                int end = len + i;
                if(end > s.length()){
                    continue;
                }
                if(t[end] == true){
                    continue;
                }
                if(s.substring(i, end).equals(x)){
                    t[end] = true;
                }
            }
        }
        System.out.println(t[s.length()]);
    };
}
