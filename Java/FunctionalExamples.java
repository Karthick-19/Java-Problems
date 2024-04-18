package Java;
public class FunctionalExamples {
    //Imperative style
    public int sum_upto(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //Functional programming style
    public int sum_upto_Functional(int n){
        return n == 0 ? 0 : n + sum_upto_Functional(n-1);
    }

    public static void main(String[] args) {
        FunctionalExamples f = new FunctionalExamples();
        System.out.println(f.sum_upto(10));
        System.out.println(f.sum_upto_Functional(10));
    }
}
