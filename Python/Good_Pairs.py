# A pair(i,j) is called a good pair if arr[i] == arr[j] and i < j
from collections import Counter
arr = [1,2,3,1,1,3]
def Brute_Force(arr):
    gp = 0
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):
            if arr[i] == arr[j]:
                gp += 1
    return gp
print(Brute_Force(arr))
def Hash_Map(arr):
    gp = 0
    hmap = {}
    for i in range(len(arr)):
        if arr[i] in hmap:
            x = hmap.get(arr[i])
            hmap[arr[i]] = x+1
        else:
            hmap[arr[i]] = 1
    for i , num in enumerate(arr):
        hmap[num] -= 1
        gp += hmap[num]
    return gp
        
print(Hash_Map(arr))
def loosodhi(arr):
    count = Counter(arr)
    gp = 0
    for i,num in enumerate(arr):
        count[num] -= 1
        # print("c :",count[num])
        gp += count[num]
        # print("gp: ",gp)
    return gp
print(loosodhi(arr))
# print(Counter(arr))
def formulated_approach(arr):
    c = Counter(arr)
    gp = 0
    print(c)
    for f in c.values():
        if f > 1:
            gp += f * (f - 1)//2
            # fotmula n*n-1/2
            # to calculate the total number of pairs (combinations) that can be formed from n items.
            # print("a :",gp)
    return gp
print(formulated_approach(arr))
# Suppose we have an array arr = [2, 2, 3, 3, 3, 4, 4], and the corresponding counts from the Counter object c are {2: 2, 3: 3, 4: 2}.

# For element 2, f = 2. There are 2 occurrences of 2, so we have 2 * (2 - 1)//2 = 1 pair of occurrences. This contributes 1 to the grand total gp.

# For element 3, f = 3. There are 3 occurrences of 3, so we have 3 * (3 - 1)//2 = 3 pairs of occurrences. This contributes 3 to the grand total gp.

# For element 4, f = 2. There are 2 occurrences of 4, so we have 2 * (2 - 1)//2 = 1 pair of occurrences. This contributes 1 to the grand total gp.

# The total number of pairs of occurrences contributing to gp is 1 + 3 + 1 = 5, which is the correct result.