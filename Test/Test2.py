# if else
from itertools import count
from builtins import str
a = "Rois has full of shame"
b = "Billy has a big dick"

if a < b:
    print("a is tang")
else:
    print("b is tang")
    
a = 15
b = 15
# elif (else if)
if a > b:
 print("a is sexy")
elif a == b:
 print("both has girls")
else:
 print("b is sexy")

# for expression
for x in range (1,6) :
    print ('%d' % (x))

#Nested Loops 
for x in range(0, 4):
    print("")
    for y in range (0, x):
        print("x", end = " ",)
        
print("")
#File Handling
countEven = 0
countOdd = 0
with open('hi.text') as f:
    for line in f :
        if(int(line) % 2 == 1):
            countOdd += 1
        else:
            countEven += 1

with open('Result.text', 'w') as g:
    g.write(str(countEven)+"\n")
    g.write(str(countOdd))
        
with open('Result.text') as i:
    data= i.read()
        
print(data)        
    