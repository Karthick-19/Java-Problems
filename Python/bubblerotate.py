arr = [1,2,3,4,5,6,7]
n = len(arr)
k =3
def Rotate_Array(arr,k,n):
    temp = 0
    for i in range(k):
        for j in range(n-1,0,-1):
            # arr[j],arr[j-1] = arr[j-1],arr[j]
            temp =arr[j]
            arr[j] =arr[j-1]
            arr[j-1] = temp
    print(arr)
# Rotate_Array(arr=[1,2,3,4,5,6,7],n=len(arr),k=3)
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
