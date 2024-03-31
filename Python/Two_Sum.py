arr = [3,2,4]
target = 6
hmap = {}
res = []
for i in range(len(arr)):
    val = target - arr[i]
    if(val in hmap):
        res.append(hmap[i])
        res.append(i)
    hmap[arr[i]] = i
print(res)