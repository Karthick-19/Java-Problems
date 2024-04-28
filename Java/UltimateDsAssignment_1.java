package Java;

import java.time.Duration;
import java.time.Instant;

// 1. Bubble Sort:
//  - Implement the Bubble Sort algorithm in your preferred programming language and
// demonstrate its functionality using a sample array.
// 2. Merge Sort:
//  - Write a program to perform Merge Sort on an array and analyze its time complexity for
// different input sizes.
// 3. Quick Sort:
//  - Develop a Quick Sort algorithm and compare its performance with other sorting algorithms
// on random and sorted input arrays.
// 4. Heap Sort:
//  - Implement Heap Sort and showcase its efficiency by sorting both small and large datasets.


public class UltimateDsAssignment_1 {
    public static void main(String[] args) {
        int[] arr = {10,3,5,11,9,6,3,01,31,89,33,2};
        int[] arr2 = {10,3,1,4,22,1,77,91,33,01,31,89,33,2};
        int[] arr3 = {10,31,4,12,0,71,11,33,01,31,89,33,2};
        Instant start_bubble = Instant.now();
        bubbleSort(arr);
        Instant end_bubble = Instant.now();
        Duration bubbleSorttime = Duration.between(start_bubble, end_bubble);
        System.out.println("\nBubble sort time: "+bubbleSorttime.toMillis());
        System.out.println("Merge sort");
        Instant start_merge = Instant.now();
        mergeSort(arr2, 0, arr2.length -1);
        for (int i : arr2) {
            System.out.print(i+" ");
        }
        Instant end_merge = Instant.now();
        Duration mergeSorttime = Duration.between(start_merge, end_merge);
        System.out.println("\nMerge sort time: "+mergeSorttime.toMillis());
        System.out.println("Quick sort");
        Instant start_quick = Instant.now();
        quickSort(arr3, 0, arr3.length-1);
        for (int i : arr3) {
            System.out.print(i+" ");
        }
        Instant end_quick = Instant.now();
        Duration quickSorttime = Duration.between(start_quick, end_quick);
        System.out.println("\nQuick sort ime: "+quickSorttime.toMillis());
        System.out.println("Heap sort");
        Instant start_heap = Instant.now();
        heapSort(arr3);;
        for (int i : arr3) {
            System.out.print(i+" ");
        }
        Instant end_heap = Instant.now();
        Duration heapSorttime = Duration.between(start_heap, end_heap);
        System.out.println("\nHeap sort ime: "+heapSorttime.toMillis());
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble sort");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void mergeSort(int[] arr,int l,int r){
        if(l < r){
            int m = (l+r)/2;
        //Divide array into two halves
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        //Merge the sorted arrays
        merge(arr,l,m,r);
        }
    }
    public static void merge(int[] arr,int l,int m,int r){
        //sizes of two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        //Create two temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copy data to temp sub arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }
        for (int i = 0; i < R.length; i++) {
            R[i] = arr[m + 1 + i];
        }

        //Merge the temporary arrays
        int i = 0,j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements from L and R
        while(i < n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        while(j < n2){
            arr[k] = R[j];
            k++;
            j++;
        }

    }
    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int p = partition(arr,low,high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int smallElements = low -1;

        for (int i = low; i < high; i++) {
            if(arr[i] < pivot){
                smallElements++;
                int temp = arr[smallElements];
                arr[smallElements] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[smallElements+1];
        arr[smallElements+1] = arr[high];
        arr[high] = temp;
        return smallElements+1;
    }
    
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
