package Java;

import java.util.ArrayList;

//Problem: There are inetegers given in an array from 1 to n
//To find: Find the missing integers in the series
//Ex:Gn=3,1,4,6,2,1,4 here weneed to return 5 and 7 as they are missing.
public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> res = new ArrayList<>();

        for (int x : arr) {
            int i = Math.abs(x) -1;
            arr[i] = -Math.abs(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                res.add(i+1);
            }
        }
        System.out.println(res.toString());
    }
}
// You've got the gist of it! This approach is called the "negation marking" technique, and it's commonly used in algorithms dealing with arrays or lists where you need to mark or manipulate elements without using extra space.

// Let's break down the steps:

// Negation marking: In the first loop, for each element x in the array, it calculates the index i based on the absolute value of x minus 1.
//  This is because array indices start from 0, but the values in arr are assumed to range from 1 to n.
// Then, it negates the value at index i by setting it to its negative counterpart.
// This process effectively marks the presence of the number i+1 in the array.

// Identifying unmarked elements: In the second loop, it iterates through the modified array. If an element at index i is still positive, it means that the number i+1 was not encountered in the first loop (i.e., it was not marked). This indicates that i+1 is missing from the original array.

// Recovering original values: Since the array was manipulated by negating elements, the elements need to be recovered before processing further. However, in this specific case, the original array values are not needed for the given problem, so it's not necessary to recover them.

// This approach is used here because the problem requires finding missing numbers in an array efficiently without using extra space. By negating elements in the array itself, the algorithm effectively marks the presence of numbers and identifies missing ones without using additional data structures.
// This technique allows the algorithm to achieve a time complexity of O(n) and space complexity of O(1), meeting the problem's requirement efficiently.
