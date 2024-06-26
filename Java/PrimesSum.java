package Java;
//Given a number N .Find if it can be expressed as sum of two prime numbers
/*
 * N = 34
 * Output: true 
 * N = 23
 * Output: false
 */


public class PrimesSum {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(primeSums(n));
    }
    private static boolean primeSums(int n){
        // n is even, the function immediately returns true.
        // This is based on the assumption that any even number can be expressed as the sum of two primes. According to Goldbach's conjecture, every even number greater than 2 can be expressed as the sum of two prime numbers.
        if(n % 2 == 0){
            return true;
        }
        // This step adjusts n by subtracting 2, effectively checking if 𝑛 − 2 
        // is a prime number. The reason behind this step is to test if n (which is odd) can be expressed as 2 +(𝑛−2)
        // where both 2 and 𝑛 − 2 are primes.
        n = n - 2;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
}
