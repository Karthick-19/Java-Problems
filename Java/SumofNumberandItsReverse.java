package Java;

// Given a non-negative integer num, return true if num can be expressed as the sum of any non-negative integer and its reverse, or false otherwise.

 

// Example 1:

// Input: num = 443
// Output: true
// Explanation: 172 + 271 = 443 so we return true.
public class SumofNumberandItsReverse {
    public static void main(String[] args) {
        int num = 443;
        for(int i = 0;i <= num;i++){
            if(i + reverseHelper(i) == num){
                System.out.println(true);
                return;
            }
        }System.out.println(false);
    }
    public static int  reverseHelper(int x){
        int rev = 0;
        while( x > 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }
}
