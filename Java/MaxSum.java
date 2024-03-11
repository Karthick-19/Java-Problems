package Java;
// Where we use the Sliding Window then we remember the following terms which is mentioned below:

// Array, String, Sub Array, Sub String, Largest Sum, Maximum Sum, Minimum Sum
// Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {10,3,6,0,12,5,9,2,12};
        int k = 3;
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i < n - k +1;i++){
            int cursum = 0;//Reinitialize cursum = 0 everytime after getting sum of current window/sum
            for(int j = 0;j < k;j++){
                cursum = cursum + arr[i+j];
                // System.out.println(cursum);
                maxsum = Math.max(maxsum, cursum);
            }
        }
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxsum);
        System.out.println(maxSumSlidingWindow(arr, k));
        System.out.println(minSumSlidingWindow(arr, k));
        System.out.println(maxSubArray0ms(nums));
        maxSubarray1ms();
    }
    public static int maxSumSlidingWindow(int[] arr,int k){
        int maxsum = 0;
        for(int i =0;i < arr.length - k + 1;i++){
            int cursum = 0;
            for(int j = 0;j < k;j++){
                cursum = cursum + arr[i+j];
            }
            maxsum = Math.max(maxsum, cursum);
        }
        return maxsum;
    }
    public static int minSumSlidingWindow(int[] arr,int k){
        int minSum = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length - k + 1;i++){
            int cursum = 0;
            for(int j = 0;j < k;j++){
                cursum = cursum + arr[i+j];
                // System.out.println(cursum);
                // System.out.println("Minimum sum: "+minSum);
            }
            minSum = Math.min(cursum, minSum);
        }
        return minSum;
    }
    public static void  maxSubarray1ms(){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int curMax = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curMax = Math.max(arr[i], curMax+arr[i]);
            maxSum = Math.max(maxSum, curMax);
        }
        System.out.println(maxSum);
    }
    
    public static int maxSubArray0ms(int[] nums) {
       int sum=0;
       int max=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
         
       max=sum>max?sum:max;
       sum = sum<0 ? 0:sum;

    }
    return max;
}
}
