# Minimum number of operations to make array empty
arr = [2,2,3,3,3,4,4]
def minOperations(arr):
    ans = 0
    i = 0
    while i < len(arr):
        n = arr[i]
        count = 0
        while i < len(arr) and n == arr[i]:
            count += 1
            i += 1
        if count == 1:
            return -1
        ans += (count +2) // 3
    return ans
print(minOperations(arr))