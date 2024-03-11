arr = [-2,-3,4,-1,-2,1,5,-3];
def Max_subarray1ms(arr):
    curSum = 0
    maxSum = arr[0]
    for i in range(len(arr)):
        curSum += arr[i]
        curSum = max(arr[i],curSum)
        maxSum = max(curSum,maxSum)
    print(maxSum)
def Max_subarray0ms(arr):
    c = 0
    m = arr[0]
    for i in range(len(arr)):
        c += arr[i]
        m = max(m,c)
        if c < 0: c = 0
    return m
print(Max_subarray0ms(arr))
Max_subarray1ms(arr)
