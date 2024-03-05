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
        
    }
}
