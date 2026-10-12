numbers=[12,35,1,10,34,35]
largest=0
secondlargest=0
for i in numbers:
   if i>largest:
       secondlargest=largest
       largest=i
   elif i>secondlargest and i!=largest:
       secondlargest=i
print("second largest number is:",secondlargest)
