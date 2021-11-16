
import sys
import math

t = int(input().strip())
for a0 in range(t):
    a = int(input().strip())
    
    ans =0
    if(a==0):
        print(0)
    else:
        for j in range(2,int(math.sqrt(a)+1)):
            while(a%j==0 and a!=j):
                a =int(a/j)
            ans=a
    print(ans)
