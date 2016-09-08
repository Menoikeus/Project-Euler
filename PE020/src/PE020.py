import math
num = str(math.factorial(100))

sum=0
n=0
print(num)
while n < len(num):
    sum += int(num[n])
    n += 1

print(str(sum))