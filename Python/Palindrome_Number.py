n =253#n = 252
s = 0
r = 0
temp = n
while(n > 0):
    r = n %10
    s = (s*10)+r
    n = n//10
if temp == s: print("Yes")
else: print("no")