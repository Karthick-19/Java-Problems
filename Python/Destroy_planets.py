# You are given an integer mass, which represents the original mass of a planet. You are further given an integer array asteroids, where asteroids[i] is the mass of the ith asteroid.

# You can arrange for the planet to collide with the asteroids in any arbitrary order. If the mass of the planet is greater than or equal to the mass of the asteroid, the asteroid is destroyed and the planet gains the mass of the asteroid. Otherwise, the planet is destroyed.

# Return true if all asteroids can be destroyed. Otherwise, return false.

 

# Example 1:

# Input: mass = 10, asteroids = [3,9,19,5,21]
# Output: true
# Explanation: One way to order the asteroids is [9,19,5,3,21]:
# - The planet collides with the asteroid with a mass of 9. New planet mass: 10 + 9 = 19
# - The planet collides with the asteroid with a mass of 19. New planet mass: 19 + 19 = 38
# - The planet collides with the asteroid with a mass of 5. New planet mass: 38 + 5 = 43
# - The planet collides with the asteroid with a mass of 3. New planet mass: 43 + 3 = 46
# - The planet collides with the asteroid with a mass of 21. New planet mass: 46 + 21 = 67
# All asteroids are destroyed.
# Example 2:

# Input: mass = 5, asteroids = [4,9,23,4]
# Output: false
# Explanation: 
# The planet cannot ever gain enough mass to destroy the asteroid with a mass of 23.
# After the planet destroys the other asteroids, it will have a mass of 5 + 4 + 9 + 4 = 22.
# This is less than 23, so a collision would not destroy the l
asteroids = [3,9,19,5,21]
mass = 10
def brute_force(asteroids,mass):
    # TC:O(nlogn)
    asteroids.sort()
    for a in asteroids:
        if a <= mass:
            mass += a
        else:return False
    return True
def optimal_sln(asteroids,mass):
    stack = []
    for a in asteroids:
        stack.append(a)
        while stack and stack[-1] <= mass:
            # print("sb :",stack)
            mass += stack.pop()
            # print("sa :",stack)
            # print("m :",mass)
    return not stack
print(brute_force(asteroids,mass))
print(optimal_sln(asteroids=[19,9,10],mass=10))