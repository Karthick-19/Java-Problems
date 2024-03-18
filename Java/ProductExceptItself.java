package Java;

import java.util.Arrays;

public class ProductExceptItself {
    public static void main(String[] args) {
        int[] qn = {1,2,3,4};
        //here we use prefix array and suffix array approach
        //Calculate the L->R  to calc product of elements to its right and initialize product 1
        //Same to calculate R-L to calc also initilaize product as 1 for this
        int[] arr = new int[qn.length];
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pro;//Initialize first element as product of 1 and itself. We should not use 0 here!!!
            pro = pro * qn[i];
        }
        pro = 1;//Reinitialize product to 1 
        for(int i = arr.length - 1;i >= 0;i--){
            arr[i] = arr[i] * pro;
            pro = pro * qn[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
