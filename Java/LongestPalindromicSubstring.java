package Java;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
    String s = "cbbd";
    String longeString = "";
    for(int i = 0;i < s.length();i++){
        int l = i;
        int r = i;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            String x =(String)s.subSequence(l, r+1);
            if(x.length() > longeString.length()){
                longeString = x;
            }
            l--;
            r++;
        }
        l =i;
        r =i+1;
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            String x = (String)s.subSequence(l, r+1);
            if(x.length() > longeString.length()){
                longeString = x;
            }
            l--;
            r++;
        }
    }
    System.out.println(longeString);
    }
}
