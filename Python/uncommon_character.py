str1 = "abcde"
str2 = "cbadfe"
res = 0
for i in range(len(str1)):
    res ^= ord(str1[i])
for i in range(len(str2)):
    res ^= ord(str2[i])
print(chr(res))