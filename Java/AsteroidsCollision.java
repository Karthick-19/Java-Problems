package Java;

import java.util.Arrays;
import java.util.Stack;

/**
 * AsteroidsCollision
 */
public class AsteroidsCollision {

    public static void main(String[] args) {
        int[] asteroids = {3,9,19,5,21};
        int mass = 5;
        System.out.println(bruteForce(asteroids, mass));
        System.out.println(optiomalSolution(asteroids, mass));
    }
    public static boolean bruteForce(int[] asteroids,int mass){
        Arrays.sort(asteroids);
        for (int i : asteroids) {
            // System.out.println(i);
            if(i <= mass){
                mass += i;
            }
            else{
                return false; 
            }
        }
        return true;
    }
    public static boolean optiomalSolution(int[] asteroids,int mass){
        Stack<Integer> stack = new Stack<>();
        for(int a: asteroids){
            stack.add(a);
            while(stack.isEmpty() == false  && stack.lastElement() <= mass){
                mass += stack.pop();
            }
        }
        return stack.isEmpty();
    }
}