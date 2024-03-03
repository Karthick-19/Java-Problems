package Java;
// Rotate Array in Java
// Problem: Rotate an array of n elements to the right by k steps. For example, 
// with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
// How many different ways do you know to solve this problem?
/**
 * RotateArray
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};   
        int n = arr.length;
        int k = 3;
        // IntermediateArray(arr, k, n);
        // BubbleRotate(arr, k, n);
        Reversal(arr, k, n);
    }
    public static void IntermediateArray(int[] arr,int k,int n){
        // Space is O(n) and time is O(n).
        //Ensure that k is within array bounds
        if(k > n) k %= n;
        //Create a duplicate array with same size of original array
        int[] res = new int[n];
        //Copy last k elements to the result array
        for(int i = 0;i < k;i++){
            res[i] = arr[n-k+i];
        }
        //Add remaining elements from the original array
        int j = 0;
        for(int i = k;i < n;i++){
            res[i] = arr[j];
            j++;
        }
    }
    public static void BubbleRotate(int[] arr,int k,int n){
        for(int i = 0;i < k;i++){
            for(int j = n - 1;j > 0;j--){
                // System.out.println();
                // System.out.println(arr[j]);
                // System.out.println(arr[j-1]);
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                // System.out.println("MiniSwap");
                // for (int l : arr) {
                //     System.out.print(l+" ");
                // }
            }
            // System.out.println(" ");
            // System.out.println("MajorSwap");
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void Reversal(int[] arr, int k,int n){
        int a = arr.length - k;
        helper(arr, 0, a-1);
        helper(arr, a, arr.length-1);
        helper(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    private static int[] helper(int[] arr,int left,int right){
            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return arr;
    } 
}
