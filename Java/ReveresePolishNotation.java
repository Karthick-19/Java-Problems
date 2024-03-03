// // The RPN, also known as the postfix notation, derives its name from the Polish notation, an earlier method.
// Therefore, RPN eliminates the need for inserting parentheses,square and curly brackets between different operators that complicate
// the mathematical expression and its calculation.In Reverse Polish Notation,
// it is important to note that the division operator performs the division operation in the order of the operands on the stack.
// The Reverse Polish Notation (RPN) refers to the mathematical notation where the operands (numerical values) are written first,
// followed by the operators. The main aim of this notation is to eliminate ambiguity, simplify evaluation, efficient memory utilization, and reduce parsing complexity.
// The problem:
// Evaluate the value of an arithmetic expression in Reverse Polish Notation.
// Valid operators are +, -, *, /. Each operand may be an integer or another
// expression.
// Some examples:
// ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
// ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
package Java;

import java.util.ArrayList;
import java.util.Stack;
// import java.util.Vector;

public class ReveresePolishNotation {
    public static void main(String[] args) {
        String[] arr = new String[]{"2","1","+","3","*"};
        ArrayList<String> list = new ArrayList<String>();
        for (String str : arr){
            list.add(str);
        }       
        RPN(arr);
        System.out.println(RPN_list(list));
    }
    public static void RPN(String[] val){
        //Creating a stack:
        Stack<String> s = new Stack<>();
        String operators = "+-*/";
        int ans = 0;
        for (String v : val) {
            // Checking if the iterated value in the list is same as any operator
            if(!operators.contains(v)){
                //If it is a number push it to stack
                s.push(v);
            }
            else{
                //If any operator detected take two values fron stack (popped)
                //We take the value as int for further calculation
                int a = Integer.valueOf(s.pop());
                int b = Integer.valueOf(s.pop());
                switch (v){
                    //After every calculation it is added back to the list as a String
                    case "+":
                    s.push(String.valueOf(a+b));
                    break;
                    case "-":
                    s.push(String.valueOf(b-a));
                    break;
                    case "*":
                    s.push(String.valueOf(a*b));
                    break;
                    case "/":
                    s.push(String.valueOf(b/a));
                    break;
                } 
            }
        }
        ans = Integer.valueOf(s.pop());
        System.out.println(ans);
    }
    public static int RPN_list(ArrayList<String> list){
        String operators = "+-*/";
        int ans = 0;
        Stack<String> stack = new Stack<>();
        for (String val : list) {
            if(!operators.contains(val)){
                stack.push(val);
            }   
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (val) {
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;
                
                    default:
                    System.out.println("Code check pannunga thozhareh..");
                        break;
                }
            }
        }
        ans = Integer.valueOf(stack.pop());
        return ans;
    }
    
}
