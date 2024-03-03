package Java;

import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(-1);
        list.add(3);
        list.add(4);
        list.add(9);
        int[] arr = {5,-1,2,4,9,3};
        selectionSort(arr);
        bubbleSort(arr);
        
    }
    public static void selectionSort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            int minVal = arr[i];
            int minIdx = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j] < minVal){
                    minVal = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0;i < arr.length -1;i++){
            for(int j = 0;j < arr.length - 1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
