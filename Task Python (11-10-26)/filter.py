numbers=[-2,1,2,3,4,6,-8]
count=0
largest=0
r=list(filter(lambda x:x>0,numbers))
r1=list(filter(lambda x:x%2==0,r))
r2=list(map(lambda x:x*x,r1))
r3=reduce(lambda x,y:x+y,r2)
r4=count+len(r1)
print(r)
print(r1)
print(r2)
print(r3)
print(r4)
print(max(r2))
