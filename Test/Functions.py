#Functions
def Rois(one, *two):
    return (one + sum(two))

print(Rois(1))
print(Rois(2,567,765))

#Function 2
def fibo(n):
    a = 0
    b = 1
    for i in range(0, n): # n = number of fibo
        temp = a
        a = b
        b = temp + b
    return a
for c in range(0, 13):
    print(fibo(c))
#Function 3 (Python programs that returns multiple values from function)
def karlos():
    return 1, 2, 3

a, b, c = karlos()

print (a)
print (b)
print (c)

