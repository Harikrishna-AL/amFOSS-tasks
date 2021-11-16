N,M = input().split()
m = int(M)
n = int(N)
ls = []
def div(number):
    i = 0
    while number%2==0:
        number /= 2
        i += 1
    return i

if 1<=n<=10**6 and 1<=m<=10**6:
    
    if n % 2!=0:
        print("0")
    if n % 2 ==0:        
        for i in range(1,m+1):
            if div(i)<div(n):
                ls.append(i)
            
        print(len(ls))
        for i in range(len(ls)):
            print("%d " %ls[i],end="")
