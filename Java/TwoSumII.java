package Java;

import java.util.Arrays;

// #This is another variation of two sum where the array is sortes
public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 9;
        int[] ans = twoSum2(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum2(int[] arr,int target){
        int[]res = new int[2];
        int l = 0,r = arr.length - 1;
        while(l < r){
            if(arr[l]+arr[r] == target){
                res[0] = arr[l];
                res[1] = arr[r];
                break;
            }
            if(arr[l] + arr[r] > target){
                r--;
            }
            else{
                l++;
            }
        }
        return res;
    }
}
