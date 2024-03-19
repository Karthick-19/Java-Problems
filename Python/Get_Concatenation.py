arr = [1,2,1]
nums = [1,2,1]
arr2 = arr.copy()
ans = arr+arr2
print(ans)
#Or else
for i in range(len(arr)):
    arr.append(arr[i])
print(arr)
#Or else
print(nums*2)