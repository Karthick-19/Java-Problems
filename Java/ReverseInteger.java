package Java;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -321;
        int x1 = 123;
        int x2 = 0;
        System.out.println(reverseString(x));
        System.out.println(reverseString(x1));
        System.out.println(reverseString(x2));
    }
    private static int reverseString(int x){
        int rev = 0;
        while(x != 0 ){
            int pop = x % 10;
            x = x / 10;
            //Conditions for checking overflow
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
