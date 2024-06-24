package Java;
// Longest Substring Without Repeating Characters

import java.util.HashMap;
import java.util.Map;

// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
public class LongestSubstringWoRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        //Use two pointer approach
        int start = 0;
        int maxLength = 0;
        Map<Character,Integer> map = new HashMap<>();
        //Use hashmap to store the appearence of elements with its indexes
        for(int end = 0;end < s.length();end++){
            char c = s.charAt(end);
            //If visiting element is already in map with the index greater than or equal to start , we encountered an repeating character.
            //Then we have to push start to the current position
            if(map.containsKey(c)&&map.get(c) >= start){
                start = map.get(c) +  1;
            }
            //Or else normally insert characters and its index in mop
            map.put(c,end);
            //Calculate maxLength of integer for each iteration
            //If suppose start is shifted then value will be 1 or 0
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println("Length of Longest Substring is : "+maxLength);
    }    
}
/*initial stage
 *abcabcbb
 s
 e 
 iterating till found a repeating char
 checks for a , b and c they are not previously added in map so iteration goes..
 after reaching a again in iteration 4
 abcabcbb
 s   e
 control goes inside condition as it satisfies conditions
 1.map already has a
 2.map.get(a) = 0 >= 0 
 now we have to move start to the end
 start = map.get(c) + 1 => 1
 also maxLength is calculated in every iteration
 for current iteration .it will be like Math.max(maxLength,end - start + 1) => max(3,2)  = 3
 abcabcbb
  s e 
   for next iteration also both condition satisfies
   1.b already in map
   2.map.get(b) = 1 / 1 >= 1
   so push start 
   start = map.get(c) + 1 => 2
   abcabcbb
     s e   

 */
