s,t = "egg","ade"
hmap = {}
x = set()
def isomorphiC(s,t):
    hmap = {}
    x = set()
    for i in range(len(s)):
        a,b = s[i],t[i]
        if(a in hmap):
            if(hmap[a] != b): return False
        elif(b in x): return False
        hmap[a] = b 
        
        x.add(b)
    return True
print(isomorphiC(s,t))