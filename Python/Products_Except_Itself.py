qn = [1,2,3,4]
#For explanation look into java code
def PfixSfix(qn):
    arr = [1]*len(qn)
    pro =1
    for i in range(len(qn)):
        arr[i] = pro
        pro = pro * qn[i]
    pro =1
    for i in range(len(qn)-1,-1,-1):
        arr[i] = arr[i] * pro
        pro = pro * qn[i]
    return arr
print(PfixSfix(qn))