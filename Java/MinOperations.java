package Java;
// You are given a 0-indexed array nums consisting of positive integers.

// There are two types of operations that you can apply on the array any number of times:

// Choose two elements with equal values and delete them from the array.
// Choose three elements with equal values and delete them from the array.
// Return the minimum number of operations required to make the array empty, or -1 if it is not possible.
public class MinOperations {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,4,4};
        System.out.println(minOperations(arr));   
    }
    public static int minOperations(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            int count = 0;
            while (i < arr.length && cur == arr[i]) {
                count++;
                i++;
            }
            if (count == 1) {
                return -1;
            }
            // count++;
            ans += (count + 2) / 3;
            System.err.println(ans);
            i--;
        }
        return ans;
    }
}
// Inside the minOperations method:

// We initialize the variable ans to 0 to store the total number of operations.
// We iterate through the array using a for loop, starting from index 0.
// Inside the loop:
// We initialize cur to store the current element.
// We initialize count to 0 to count the number of consecutive occurrences of cur.
// We enter another while loop to count consecutive occurrences of cur as long as i is within the bounds of the array and cur is equal to arr[i].
// After exiting the inner while loop, we check if count is 1. If it is, that means there's a single element without any matching adjacent elements, so we return -1 indicating an error.
// Otherwise, we calculate the number of operations required to process the consecutive occurrences of cur and add it to ans. The calculation (count + 2) / 3 gives the minimum number of operations required to process count elements.
// Finally, we decrement i to account for the last increment in the inner while loop.
// After processing all elements in the array, we return the total number of operations stored in ans.
