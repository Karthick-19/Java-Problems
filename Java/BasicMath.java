package Java;
import java.lang.Math;

public class BasicMath {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public static int lcm(int a, int b){
        return Math.abs(a*b) / gcd(a, b);
    }
}
