binary = 1011
dec = 0
temp = 0
n = 0
while(True):
    if binary == 0: break
    temp = binary % 10
    # print(temp)
    dec += temp * (2**n)
    # print("dec ",dec)
    binary //= 10
    n+=1
print(dec)
