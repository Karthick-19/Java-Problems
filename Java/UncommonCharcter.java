package Java;

public class UncommonCharcter {
    public static void main(String[] args) {
        String one = "cbdea";
        String two = "ebdfac";
        char ans = 0;
        for(int i = 0; i < one.length();i++){
            ans ^= one.charAt(i);
        }
        for(int i = 0; i < two.length();i++){
            ans^= two.charAt(i);
        }
        System.out.println(ans);
    }
}
