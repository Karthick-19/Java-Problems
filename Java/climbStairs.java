package Java;

//Climbing Stairs
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step
public class climbStairs {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i < n+1;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        // return arr[n]; 
        System.out.println(arr[n]);
        System.out.println(climb_Stairs(n));
    }
    public static int climb_Stairs(int n) {
        //Creating an empty array of size n + 1
        int[] arr = new int[n+1];
        //(do nothing) is the only way to stay on step 0
        arr[0] = 1;
        //Going to step 1 is possible only with 1 step
        arr[1] = 1;
        //Starting iteration of array from 2 since 0 and 1 already filled
        //iterated till n+1 coz we are starting it from 2
        for(int i = 2;i < n + 1;i++){
            //Value of current step will be sum of previous step and previous of previous step
            arr[i] = arr[i-1] + arr[i-2];
        }
        // This array contains required steps for each step returning our given step
        return arr[n];
    }
    
}