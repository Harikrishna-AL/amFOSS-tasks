N = int(input())
W = list(map(int, input().split()))
Weight = [int(i) for i in W]
Weight.sort()

v = set(W)
w = list(v)
a = []

if 1<=N<= 1000 and Weight[-1]<=1000 and 1<=Weight[0]:
    for i in range(len(w)):
        n = W.count(w[i])
        a.append(n)
    a.sort()
    print(a[-1], len(a), end = "")
