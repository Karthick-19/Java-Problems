package Java;
// To check whether the given number (int) is a palindrome or not
public class Palindromenumber {
    public static void main(String[] args) {
        int r,sum = 0,temp;
        int n = 252;
        temp = n;
        while(n > 0){
            r = n%10;
            sum = (sum*10)+r;
            // System.out.println("Sum "+sum);
            n = n/10;
        }
        if(temp == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
