package Java;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        fibonacciSeries(n);
        System.out.println("\nUsing recursion");
        for (int i = 0; i <= n; i++) {
            System.out.print(recusrionFibonacci(i)+" ");
        }
    }
    public static void fibonacciSeries(int n){
        System.out.println("Printing fibonacci series upto "+n);
        int a = 0,b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
    public static int recusrionFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return recusrionFibonacci(n-1) +recusrionFibonacci(n-2);
    }
}
