#This is another variation of two sum where the array is sortes
arr = [1,2,3,4,5,]
target = 9
res=[]
#Two pointers l and r
l = 0
r = len(arr)-1
while(l < r):
    if(arr[l]+arr[r] == target):
        res.append(arr[l])
        res.append(arr[r])
        break
    if(arr[l]+arr[r] > target):
        r -= 1
    else:
        l += 1
print(res)