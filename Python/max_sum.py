import sys
arr = [2,4,5,1,9,10,0,6]
k = 3
def max_sum(arr,k):
    maxsum = -sys.maxsize
    for i in range(0,len(arr) - k + 1):
        cursum = 0
        for j in range(0,k):
            cursum = cursum + arr[i+j]
        maxsum = max(cursum,maxsum)
    return maxsum
def min_sum(arr,k):
    min_sum = sys.maxsize
    for i in range(0,len(arr) - k + 1):
        cursum = 0
        for j in range(0,k):
            cursum = cursum + arr[i+j]
        min_sum = min(cursum,min_sum)
    return min_sum
print(max_sum(arr,k))
print(min_sum(arr,k))
