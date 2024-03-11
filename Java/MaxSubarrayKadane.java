package Java;

public class MaxSubarrayKadane {
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
public static void main(String[] args) {
    int[] arr = {-2,-3,4,-1,-2,1,5,-3};
    maxSubarray1ms();
    System.out.println(maxSubArray0ms(arr));
}
}
