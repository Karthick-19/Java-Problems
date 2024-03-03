# // // The RPN, also known as the postfix notation, derives its name from the Polish notation, an earlier method.
# // Therefore, RPN eliminates the need for inserting parentheses,square and curly brackets between different operators that complicate
# // the mathematical expression and its calculation.In Reverse Polish Notation,
# // it is important to note that the division operator performs the division operation in the order of the operands on the stack.
# // The Reverse Polish Notation (RPN) refers to the mathematical notation where the operands (numerical values) are written first,
# // followed by the operators. The main aim of this notation is to eliminate ambiguity, simplify evaluation, efficient memory utilization, and reduce parsing complexity.
# // The problem:
# // Evaluate the value of an arithmetic expression in Reverse Polish Notation.
# // Valid operators are +, -, *, /. Each operand may be an integer or another
# // expression.
# // Some examples:
# // ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
# // ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
arr = ["2","1","+","3","*"]
operators = "+-*/"
operator_dict = {
    "+":lambda a,b:a+b,
    "-":lambda a,b:b-a,
    "*":lambda a,b:a*b,
    "/":lambda a,b:b/a  
}
ans = 0
stack = []
for i in arr:
    if i not in operators:
        # While adding elements to stack convert into int because defaultly added as non-int type
        stack.append(int(i))
    else:
        a = stack.pop()
        b = stack.pop()
        # this operator_function takes the value pair in the operator_dict (its operattion)
        operator_function = operator_dict[i]
        # After evaluating them in the lambda operation it is stored in the res variable
        res = operator_function(a,b)
        stack.append(res)
ans = stack.pop()
print(ans)
def rpn(arr):
    stack = []
    operators = "+-*/"
    ans,res = 0,0
    for i in arr:
        if i not in operators:
            stack.append(int(i))
        elif i == "+":
            a = stack.pop()
            b = stack.pop()
            res = a + b
            stack.append(res)
        elif i == "-":
            a = stack.pop()
            b = stack.pop()
            res = b - a
            stack.append(res)
        elif i == "*":
            a = stack.pop()
            b = stack.pop()
            res = a * b
            stack.append(res)
        elif i == "/":
            a = stack.pop()
            b = stack.pop()
            res = b + a
            stack.append(res)
    ans = stack.pop()
    return ans
print(rpn(arr))
        
        




