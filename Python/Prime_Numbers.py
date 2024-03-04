# The loop should include the value x//2 itself.
# Otherwise, you'll miss checking the possibility of x 
# being divisible by its square root if x is not a perfect square.
x = 97
for i in range(2,x//2+1):
    if x % i == 0:
        print("No it is not a prime number")
print("It is a prime number")