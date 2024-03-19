arr = [1,0,3,1,0,1,2,0,3]
# // here we use two pointer approach first pointer pointing the index i and we have one more pointer called non_zero. both start at position 0.the main condition if the index i points to a non-zero element then the element at the index i and non_zero gets swapped. also the non zero index only gets incremented when the swap occurs.the index i increments anyways in the for loop
def rearranging_0s(arr) -> []:  # type: ignore
    non_zero = 0
    for i in range(len(arr)):
        if arr[i] != 0:
            arr[i],arr[non_zero] = arr[non_zero],arr[i]
            non_zero += 1
    return arr
print(rearranging_0s(arr))
#Cool trick: This problem can be also done by negative reversing the array
arr.sort(reverse=True)
print(arr)