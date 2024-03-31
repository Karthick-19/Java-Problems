// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]
package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        twoSum(arr, target);
    }
    public static void twoSum(int[] arr,int target){
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            int val = target - arr[i];
            if(map.containsKey(val)){
                res[0] = map.get(val);
                res[1] = i;
            }
            map.put(arr[i],i);
        }
        String ans = Arrays.toString(res);
        System.out.println(ans);
    }
}