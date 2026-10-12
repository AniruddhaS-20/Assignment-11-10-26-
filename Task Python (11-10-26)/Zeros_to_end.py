numbers=[0,1,0,3,12,0,5]
nonzero=[]
zeros=[]
for i in numbers:
    if i!= 0:
        nonzero.append(i)
    else:
        zeros.append(i)
numbers=nonzero+zeros
print("numbers are:",numbers)