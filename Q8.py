def factor(n:int ,k:int):
    limit=int(n**0.5)
    l1=[]
    for i in range(1,limit+1):
        if(n%i==0):
            l1.append(i)
            if(n//i!=i):
                l1.append(n//i)
    l1.sort()
    if(k<=len(l1)):
        return l1[k-1]
    return -1
n=int(input("Enter n\n"))
k=int(input("Enter k\n"))
print(factor(n,k))





    