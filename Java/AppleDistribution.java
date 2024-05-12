package Java;

import java.util.Arrays;
// You are given an array apple of size n and an array capacity of size m.

// There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.

// Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

// Note that, apples from the same pack can be distributed into different boxes.
public class AppleDistribution {
    public static void main(String[] args) {
        int[] apple = {1,3,2};
        int[] capacity = {4,3,1,5,2};
        Arrays.sort(capacity);
        int[] arr = new int[capacity.length];
        for (int i = 0; i < capacity.length; i++) {
            arr[capacity.length - 1 - i] = capacity[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(appleDistribution(apple, arr));
    }
    static int appleDistribution(int[] apple,int[] arr){
        int totalApples = Arrays.stream(apple).sum();
        int boxes = 0;
        if(totalApples <= 0) return 0;
        for (int box : arr) {
            totalApples -= box;
            boxes++;
            if(totalApples <= 0) break;
        }
        return boxes;
    }
}
