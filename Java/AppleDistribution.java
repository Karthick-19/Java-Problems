package Java;

import java.util.Arrays;

public class AppleDistribution {
    public static void main(String[] args) {
        int[] apple = {1,3,2};
        int[] capacity = {4,3,1,5,2};
        Arrays.sort(capacity);
        int[] arr = new int[capacity.length];
        for (int i = 0; i < capacity.length; i++) {
            arr[capacity.length - 1 - i] = capacity[i];
        }
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
