package Java;
// 2221. Find Triangular Sum of an Array

// You are given a 0-indexed integer array nums, where nums[i] is a digit between 0 and 9 (inclusive).

// The triangular sum of nums is the value of the only element present in nums after the following process terminates:

// Let nums comprise of n elements. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n - 1.
// For each index i, where 0 <= i < n - 1, assign the value of newNums[i] as (nums[i] + nums[i+1]) % 10, where % denotes modulo operator.
// Replace the array nums with newNums.
// Repeat the entire process starting from step 1.
// Return the triangular sum of nums.
/*
 * [1]  [2]  [3]  [4]  [5]
 *  \   / \  / \  / \  /
 * [3]    [5]  [7]  [9]
 *  \     /\   /\   /
 *    [8]   [2]  [6]
 *     \    /\    /
 *      [0]   [8]
 *        \   /
 *         [8]
 */
public class TriangularSumOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        //iterating till size of array becomes 1
        while(nums.length > 1){
            //newNUms for each iteration which is reduced from previous one
            int[] newNums = new int[nums.length - 1];
            //iteratig till n -1 coz, adding two elements at a time
            for(int i = 0; i < nums.length -1;i++){
                newNums[i] = (nums[i] + nums[i+1]) % 10; 
            }
            //After creating newNums change nums to newNums for further deduction
            nums = newNums;
        }
        System.out.println("The triangular sum of given array is: "+nums[0]);
    }
}
