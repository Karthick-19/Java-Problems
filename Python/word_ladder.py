start = 'hit'
end = 'cog'
dict = ['hot','dot','dog']
def wordLadder(start,end,dict):
    if dict.len == 0:
        return 0
    dict.append(end)
    wordQ = []
    distQ = []
    wordQ.append(start)
    distQ.append(1)
    res = 99999999
    while(len(wordQ) != 0):
        curWord = wordQ.pop
        curDistance = distQ.pop

        if curWord == end:
            return min(res,curDistance)
        for i in range(len(curWord)):
            curchararr = []


