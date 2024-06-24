package Java;

// Max Number of K-Sum Pairs
// You are given an integer array nums and an integer k.

// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

// Return the maximum number of operations you can perform on the array.

 

// Example 1:

// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4]:
// - Remove numbers 1 and 4, then nums = [2,3]
// - Remove numbers 2 and 3, then nums = []
// There are no more pairs that sum up to 5, hence a total of 2 operations.
// Example 2:

// Input: nums = [3,1,3,4,3], k = 6
// Output: 1
// Explanation: Starting with nums = [3,1,3,4,3]:
// - Remove the first two 3's, then nums = [1,4,3]
// There are no more pairs that sum up to 6, hence a total of 1 operation.

import java.util.HashMap;
import java.util.Map;


public class MaxNumberOf_KSumPairs{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        int op = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            int val = k - num;
            //Checking if the val is present in map and its get value is greater than 0
            //increment op
            if(map.getOrDefault(val, 0) > 0){
                op++;
                //decrement the get value of val , so that it won't get counted again 
                map.put(val,map.get(val)-1);
            }
            //if val is not in map , add num to map with get value  + 1 
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        System.out.println(op);
        int a  = 11;
        int b = 4;
        help(b);
        help(a);

    }
    public static void help(int a){
        String s = Integer.toString(a);
        int sum = 0;
        for(char c: s.toCharArray()){
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}