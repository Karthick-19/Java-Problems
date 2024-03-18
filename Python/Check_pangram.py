s = "a quick brown fox jumps over the lazy dog"
print(ord('a'))
print(ord('z'))
def isPangram(s):
    if len(s) < 26:
        return False
    s = s.lower()
    for i in range(ord('a'),ord('z')+1):
        if chr(i) not in s:
            return False
    return True
print(isPangram(s))

def usingSet(s):
    return len(set(s)) >= 26
print(usingSet(s))