package Java;
import java.util.Arrays;

public class SquaresofSortedarr {
    public static void main(String[] args) {
        int[] arr = {-4,2,8,0,-1,3};
        for(int i = 0;i < arr.length;i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
