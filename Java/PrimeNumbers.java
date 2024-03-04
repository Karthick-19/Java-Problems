package Java;

public class PrimeNumbers {
    public static void main(String[] args) {
        int x = 98;
        boolean flag = false;
        for(int i = 2;i < x/2;){
            if(x % i == 0) flag = true;
            break;
        }
        if(flag == true) System.out.println("It is not a prime");
        else System.out.println("It is a Prime");
    }
}
