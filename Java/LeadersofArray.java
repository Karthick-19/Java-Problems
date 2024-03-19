package Java;
// # Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

import java.util.ArrayList;
// # Example 1:
import java.util.List;

// # Input:
// # n = 6
// # A[] = {16,17,4,3,5,2}
// # Output: 17 5 2
// # Explanation: The first leader is 17 
// # as it is greater than all the elements
// # to its right.  Similarly, the next 
// # leader is 5. The right most element 
// # is always a leader so it is also 
// # included.
public class LeadersofArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) flag = false;
            }
            if(flag == true) list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println(optimal_sln(arr));
    }
    static List<Integer> optimal_sln(int[] arr){
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int maxElement = arr[n-1];
        list.add(maxElement);
        for(int i = n-1;i >= 0;i--){
            if(arr[i] > maxElement){
                list.add(arr[i]);
                maxElement = arr[i];
            }
        }
        return  list.reversed();
    }
}
