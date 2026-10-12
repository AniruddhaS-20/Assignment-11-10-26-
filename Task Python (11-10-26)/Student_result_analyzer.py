analyzemarks=(35,72,80,45,90,30)
totalmarks=sum(analyzemarks)
averagemarks=totalmarks/len(analyzemarks) if len(analyzemarks)>0 else 0
highestmarks=max(analyzemarks)
passingstudents=len([marks for marks in analyzemarks if marks>=40])

print("Total Marks:",totalmarks)
print("Average Marks:",averagemarks)
print("Highest Marks:",highestmarks)
print("Passing Students are:",passingstudents)