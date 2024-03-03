import sys
arr = [20,10,100,34,38,90,99]
first_largest = -sys.maxsize
second_largest = -sys.maxsize
for i in range(len(arr)):
    if arr[i] > first_largest:
        second_largest = first_largest
        first_largest = arr[i]
    if arr[i] < first_largest and arr[i] > second_largest:
        second_largest = arr[i]
print(second_largest)