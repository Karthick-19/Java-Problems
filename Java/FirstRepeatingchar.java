package Java;

import java.util.HashSet;

public class FirstRepeatingchar {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String s = "hsbadockmk";
        for(int i = 0;i< s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                System.out.println("Repeating Character :"+ch);
                return;
            }
            else set.add(ch);
        }
    }

}
