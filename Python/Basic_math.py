import math
factorial = math.factorial(5)  # Computes 5!
print(factorial)
def gcd(a,b):
    while b != 0:
        a,b = b,a%b
    return a
print(gcd(12,24))
def lcm(a,b):
    return abs(a*b) // gcd(a,b)
print(lcm(12,18))