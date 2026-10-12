numbers=[1,1,2,2,2,3,3,1,1,1,1]
maxcount=0
currentcount=0
for i in range(1,len(numbers)):
    if numbers[i]==numbers[i-1]:
        currentcount+=1
    else:
        if currentcount>maxcount:
            maxcount=currentcount
        currentcount=1
if currentcount>maxcount:
    maxcount=currentcount
print("maximum run of consecutive occurrences:",maxcount)