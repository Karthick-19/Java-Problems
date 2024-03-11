package Java;

import java.util.HashMap;

public class MaxFrequencychar {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "andbskvzamabvknakkn";
        for(int i = 0;i <s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) == true){
                int cfreq = map.get(ch);
                map.put(ch,cfreq+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int maxVal = 0;
        char maxChar = 'a';
        for(Character x:map.keySet()){
            if(map.get(x) > maxVal){
                maxVal = map.get(x);
                maxChar = x;
            }
        }
        System.out.println("Maximum occuring character: "+maxChar+" Times: "+maxVal);
        int[] arr = {1,2,42,1,45,6,1,2};
        maxchararray(arr);
        
    }
    public static void maxchararray(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i <arr.length;i++){
            int ch = arr[i];
            if(map.containsKey(ch) == true){
                int cfreq = map.get(ch);
                map.put(ch,cfreq+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int maxVal = 0;
        Integer maxChar = 0;
        for(Integer x:map.keySet()){
            if(map.get(x) > maxVal){
                maxVal = map.get(x);
                maxChar = x;
            }
        }
        System.out.println("Maximum occuring character: "+maxChar+" Times: "+maxVal);
    }
    public static int maxchararray2(int[] a){
        int max = 0;
        int mostFreq = a[0];
        int[] count = new int[a.length + 1];

        for (int num : a) {
        count[num]++;
        if (count[num] > max)
        {
        max = count[num];
        mostFreq = num;
        }
        }

        return mostFreq;
    }
}
