
import math
n = int(input())
Divisors = []

def Div(n) :
    
    if (n <= 10**12 and n >= 1):    
        for i in range(1, int(math.sqrt(n) + 1)) :
            
            if (n % i == 0) :
                if (n / i == i) :
                    Divisors.append(i)
                else :
                    Divisors.append(i)
                    Divisors.append(int(n / i))
        print(len(Divisors))
        
Div(n)
        
        


