package Java;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {45,20,10,55,90,28,93};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i:arr){
            if(i > firstLargest){
                secondLargest = firstLargest;
                firstLargest = i;
            }
            if(i < firstLargest && i > secondLargest) secondLargest = i;
            // System.out.println("f"+firstLargest);
            // System.out.println("s"+secondLargest);
        }
        System.out.println(secondLargest);
        Arrays.sort(arr);
        int ans = arr[arr.length - 2];
        System.out.println(ans);
    }
}
