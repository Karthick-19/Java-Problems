package Java;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;
        for(int i =0; i< s.length();i++){
            if(!t[i]){
                continue;
            }
            for (String x : dict) {
                int len = x.length();
                int end = len + i;
                
                if(end > s.length()){
                    continue;
                }
                if(t[end]){
                    continue;
                }
                if(s.substring(i, end).equals(x)){
                    t[end] = true;
                }
            }
        }
        System.out.println(t[s.length()]);
        for (boolean b : t) {
            System.out.println(b);
        }
    };
}
