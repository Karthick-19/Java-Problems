s = "()[]"
def valid_paranthesis(s) -> bool:
    arr = []
    for i in s:
        if(i == '{' or i == '(' or i == '['):
            arr.append(i)
        elif(i == '}' and len(arr) != 0 and arr[-1] == '{'):
            arr.pop()
        elif(i == ')' and len(arr) != 0 and arr[-1] == '('):
            arr.pop()
        elif(i == ']' and len(arr) != 0 and arr[-1] == '['):
            arr.pop()
        else:
            return False
    return len(arr) == 0
print(valid_paranthesis(s))
def more_optimized(s) -> bool:
    allowed = {'{':'}','(':')','[':']'}
    arr = []
    for p in s:
        if p in allowed:
            arr.append(p)
        elif p in allowed.values():
            if not arr or allowed[arr.pop()] != p:
                return False
    return not arr #if the stack is empty then string has valid parenthesis