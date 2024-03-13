package Java;

import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg",t = "add";
        System.out.println(isomprphiC(s, t));
    }
    static boolean isomprphiC(String s,String t){
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set =  new HashSet<>();

        for(int i = 0;i < s.length();i++){
            char a = s.charAt(i),b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b) return false;
            }
            else if(set.contains(b)) return false;
            map.put(a,b);
            set.add(b);
        }
        return true;
    }
}
