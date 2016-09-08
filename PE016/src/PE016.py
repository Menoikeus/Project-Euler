number = pow(2, 1000)
print(number)

workingNumber = str(number)
sum = 0
x = 0
for x in range(0, len(workingNumber)):
   sum = sum + int(workingNumber[x])

print(sum)