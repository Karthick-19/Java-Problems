# //Problem: There are inetegers given in an array from 1 to n
# //To find: Find the missing integers in the series
# //Ex:Gn=3,1,4,6,2,1,4 here weneed to return 5 and 7 as they are missing.
arr = [4,3,2,7,8,2,3,1]
res = []
for ele in arr:
    x = abs(ele) - 1
    arr[x]  = -abs(arr[x])
    print(arr[x])
for i in range(len(arr)):
    if arr[i] > 0:
        res.append(i + 1)
print(res)