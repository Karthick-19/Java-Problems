# You are given an array apple of size n and an array capacity of size m.

# There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.

# Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

# Note that, apples from the same pack can be distributed into different boxes.

 

# Example 1:

# Input: apple = [1,3,2], capacity = [4,3,1,5,2]
# Output: 2
# Explanation: We will use boxes with capacities 4 and 5.
# It is possible to distribute the apples as the total capacity is greater than or equal to the total number of apples.

apple = [1,3,2]
capacity = [4,3,1,5,2]
def apple_distribution(apple,capacity) -> int:
    total_apples = sum(apple)
    capacity.sort(reverse = True)
    if total_apples <= 0:
        return 0
    boxes = 0
    for box in capacity:
        total_apples -= box
        boxes += 1
        if total_apples <= 0:
            break
    return boxes
print(apple_distribution(apple,capacity))