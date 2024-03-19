# Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

# Example 1:

# Input:
# n = 6
# A[] = {16,17,4,3,5,2}
# Output: 17 5 2
# Explanation: The first leader is 17 
# as it is greater than all the elements
# to its right.  Similarly, the next 
# leader is 5. The right most element 
# is always a leader so it is also 
# included.

arr = [16,17,4,3,5,2]
flag = True
leaders = []
for i in range(len(arr)):
    flag =True
    for j in range(i+1,len(arr)):
        if arr[i] < arr[j]:
            flag = False
    if flag == True:
        leaders.append(arr[i])
print(leaders)
def optimized_sln(arr) -> list[int]:
    leaders = [arr[-1]]
    max_ele = arr[len(arr)-1]
    for i in range(len(arr)-1,-1,-1):
        if arr[i] > max_ele:
            leaders.append(arr[i])
            max_ele = arr[i]
    return leaders[::-1]
print(optimized_sln(arr))
