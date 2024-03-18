package Java;

import java.util.HashMap;
import java.util.Stack;
//The logic here is in the loop, first we check if the element is opening bracket if it is then we add it to stack expecting the closing bracket, then if we come across any closing brackets in string we check if the current top element in the stack is its matching opening bracket if not , then the string contains a invalid paranthesis and it must return false.If the loop gets over matching and popping elements from the stack then the stack must be empty
/**
 * ValidParanthesis
 */
public class ValidParanthesis {
public static void main(String[] args) {
    String s = "{[]}";
    System.out.println(valid(s));
    System.out.println(optimized_sln(s));

}
static boolean valid(String s){
    Stack<Character> stack = new Stack<>();
    char[] arr = s.toCharArray();
    for (char p : arr) {
        if(p == '{' || p == '(' || p == '[') stack.push(p);
        else if(p == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
        else if(p == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
        else if(p == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
        else return false;
    }
    return stack.isEmpty();
}
static boolean optimized_sln(String s){
    Stack<Character> stack = new Stack<>();
    HashMap<Character,Character> map = new HashMap<>();
    char[] arr = s.toCharArray();

    for (char p : arr) {
        if(map.containsKey(p)) stack.push(p);
        else if(map.containsValue(p)){
            if(stack.isEmpty() || stack.peek() != p) return false;
        }
    }
    return stack.isEmpty();
}
}