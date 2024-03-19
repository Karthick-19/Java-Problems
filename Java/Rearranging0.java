package Java;

import java.util.Arrays;
// here we use two pointer approach first pointer pointing the index i and we have one more pointer called non_zero. both start at position 0.the main condition if the index i points to a non-zero element then the element at the index i and non_zero gets swapped. also the non zero index only gets incremented when the swap occurs.the index i increments anyways in the for loop
public class Rearranging0 {
    public static void main(String[] args) {
        int[] arr = {1,0,3,1,0,1,2,0,3};
        int non_zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[non_zero];
                arr[non_zero] = temp;
                non_zero++;//Incrementing non-zero after the swap
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
