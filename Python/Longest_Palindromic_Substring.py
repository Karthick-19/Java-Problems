s = "bcaaba"
n = len(s)//2
temp = []
longest_palindrome = ""
for i in range(len(s)):
    l,r = i,i+1
    while(l >= 0 and r < len(s) and s[l] == s[r]):
        x = s[l:r+1]
        if len(x) > len(longest_palindrome):
            longest_palindrome = x
        l-=1
        r+=1
    l,r = i,i
    while(l >= 0 and r < len(s) and s[l] == s[r]):
        x = s[l:r+1]
        if len(x) > len(longest_palindrome):
            longest_palindrome = x
        l-=1
        r+=1
print(longest_palindrome)
