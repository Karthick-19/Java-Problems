package Java;

import java.util.Collections;
import java.util.PriorityQueue;

// Minimum Operations to Halve Array Sum

// You are given an array nums of positive integers. In one operation, you can choose any number from nums and reduce it to exactly half the number. (Note that you may choose this reduced number in future operations.)

// Return the minimum number of operations to reduce the sum of nums by at least half.

 

// Example 1:

// Input: nums = [5,19,8,1]
// Output: 3
// Explanation: The initial sum of nums is equal to 5 + 19 + 8 + 1 = 33.
// The following is one of the ways to reduce the sum by at least half:
// Pick the number 19 and reduce it to 9.5.
// Pick the number 9.5 and reduce it to 4.75.
// Pick the number 8 and reduce it to 4.
// The final array is [5, 4.75, 4, 1] with a total sum of 5 + 4.75 + 4 + 1 = 14.75. 
// The sum of nums has been reduced by 33 - 14.75 = 18.25, which is at least half of the initial sum, 18.25 >= 33/2 = 16.5.
// Overall, 3 operations were used so we return 3.
// It can be shown that we cannot reduce the sum by at least half in less than 3 operations.
public class MinimumOperationToHalveArraySum {
    public static void main(String[] args) {
        int[] nums = {5,19,8,1};
        double initialSum = 0;
        for(int num:nums){
            initialSum += num;
        }
        double target = initialSum / 2;
        double currentSum = initialSum;
        int op = 0;

        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            maxHeap.add((double) num);
        }

        while(currentSum > target){
            double largest = maxHeap.poll();
            double reduced = largest / 2;
            currentSum = currentSum - reduced;
            maxHeap.add(reduced);
            op++;
        }
        System.out.println("Required number of operations: "+op);
    }
}

// Key Steps:
// Initial Sum Calculation:

// We first calculate the initial sum of the array, initialSum.
// Target Calculation:

// Our target is to reduce the sum to at least half of the initial sum, so we set target = initialSum / 2.
// Priority Queue (Max-Heap):

// We use a max-heap (priority queue) to always pick the largest number to reduce. Reducing the largest number has the greatest impact on the sum, which helps us reach our target with the minimum number of operations.
// In Java, the PriorityQueue by default is a min-heap. To turn it into a max-heap, we use Collections.reverseOrder().
// Reduce the Largest Element:

// We repeatedly extract the largest element from the heap, reduce it by half, and add the reduced value back into the heap. We also update the current sum accordingly.
// We count each reduction as an operation.
// Loop Until Target is Reached:

// We continue the process until the current sum is less than or equal to the target.

// In Java, the PriorityQueue is a min-heap by default, meaning it gives you the smallest element when you call poll(). Since we need a max-heap to get the largest element each time, we use Collections.reverseOrder() to reverse the natural ordering of the elements, effectively turning the PriorityQueue into a max-heap.

// double largest = maxHeap.poll()
// will not try to fetch us the max element from maxHeap
// at first we sorted it in descending order later after adding the 9.5
// we used it in its next iteration and during the next iteration we added the other reduced element which will be the largest for the next iteration
// am i right here