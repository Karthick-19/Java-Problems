# // Rotate Array in Java
# // Problem: Rotate an array of n elements to the right by k steps. For example, 
# // with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
# // How many different ways do you know to solve this problem?
# /**
#  * RotateArray
#  */
arr = [1,2,3,4,5]
n = len(arr)
k = 2
def IntermediateArray(arr,k,n):
    #Ensure that k is within array bounds
    if k > n:
        k %= n
    #Create a duplicate array wuth same size of original array
    res = []
    #Copy last k elements to the result array
    for i in range(k):
        res.append(arr[n - k + i])
    #Add remaining elements from the original array
    j = 0
    for i in range(k,n):
        res.append(arr[j])
        j+=1
    print(res)
# print(IntermediateArray(arr,k,n))
def Rotate_Array(arr,k,n):
    temp = 0
    for i in range(0,k):
        for j in range(n-1,0,-1):
            # arr[j],arr[j-1] = arr[j-1],arr[j]
            temp =arr[j]
            arr[j] =arr[j-1]
            arr[j-1] = temp
    print(arr)
# Rotate_Array(arr=[1,2,3,4,5,6,7],n=len(arr),k=3)
#This same shit code gives correct output when used somewhere else;((
def Reversal(arr,k,n):
    x = n - k
    def helper(arr,left,right):
        while(left < right):
            arr[left],arr[right] = arr[right],arr[left]
            left+=1
            right-=1
    helper(arr,0,x-1)
    helper(arr,x,n-1)
    helper(arr,0,n-1)
    return arr
print(Reversal(arr=[1,2,3,4,5,6,7],k = 3,n = len(arr)))
#This same shit code gives correct output when used somewhere else;((
