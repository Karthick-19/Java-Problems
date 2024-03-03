package Java;

import java.util.HashSet;
import java.util.LinkedList;

public class WordLadder {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        HashSet<String> dict = new HashSet<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        System.out.println(WordLadder(start, end, dict));
        // if(dict.size() == 0) {
        //     System.out.println(0);
        //     return;
        // }
        // dict.add(end);
        // LinkedList<String> wordQueue = new LinkedList<>();
        // LinkedList<Integer> distQueue = new LinkedList<>();
        // wordQueue.add(start);
        // distQueue.add(1);
        // int res = Integer.MAX_VALUE;
        // while(!wordQueue.isEmpty()){
        //     String curWord = wordQueue.pop();
        //     Integer curDistance = distQueue.pop();

        //     if(curWord.equals(end)){
        //         int x = Math.min(res, curDistance);
        //         System.out.println(x);
        //         return;
        //     }

        //     for(int i = 0;i < curWord.length();i++){
        //         char[] curcharArr = curWord.toCharArray();
        //         for(char c = 'a'; c <= 'z';c++){
        //             curcharArr[i] = c;
        //             String newWord = new String(curcharArr);
        //             if(dict.contains(newWord)){
        //                 wordQueue.add(newWord);
        //                 distQueue.add(curDistance+1);
        //                 dict.remove(newWord);
        //             }
        //         }
        //     }


        // }
        // if(res < Integer.MAX_VALUE){
        //     System.out.println(res);
        //     return;
        // }


    }
    public static int WordLadder(String start,String end,HashSet<String> dict){
        if(dict.size() == 0){
            return 0;
        }

        dict.add(end);
        LinkedList<String> wordQueue = new LinkedList();
        LinkedList<Integer> distanceQueue = new LinkedList<>();
        wordQueue.add(start);
        distanceQueue.add(1);

        int result = Integer.MAX_VALUE;
        while(!wordQueue.isEmpty()){
            String curWord = wordQueue.pop();
            Integer curDistance = distanceQueue.pop();

            if(curWord.equals(end)){
                return Math.min(curDistance, result);
            }

            for(int i = 0;i < curWord.length();i++){
                char[] curcharArr = curWord.toCharArray();
                for(char c = 'a';c <= 'z';c++){
                    curcharArr[i] = c;
                    String newWord = new String(curcharArr);
                    if(dict.contains(newWord)){
                        wordQueue.add(newWord);
                        distanceQueue.add(curDistance+1);
                        dict.remove(newWord);
                    }
                }
            }

        }
        if (result < Integer.MAX_VALUE)
                return result;
            else
                return 0;
    }
}
