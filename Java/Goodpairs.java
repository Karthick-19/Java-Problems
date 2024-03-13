package Java;

import java.util.HashMap;

/**
 * Goodpairs
 */
public class Goodpairs {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int gp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) gp += 1;
            }
        }
        System.out.println(gp);
        System.out.println(Hashmethod(arr));
        System.out.println(formulatedMethod(arr));
    }
    public static int Hashmethod(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int gp = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if(map.containsKey(cur)){
                int freq = map.get(cur);
                map.put(cur,freq+1);
            }
            else{
                map.put(cur, 1);
            }
        }
        for (int n: arr) {
            map.put(n,map.get(n)-1);
            gp += map.get(n);
        }
        return gp;
    }
    public static int formulatedMethod(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int gp = 0;
        for (int i : arr) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for (int i : map.keySet()) {
            int e = map.get(i);
            if(e > 1){
                gp += e * (e-1) / 2;
            }
        }
        return gp;
    }
}