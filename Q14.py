def newArr(s,t):
    l1=[]
    for e in s:
        if(int(e)>=t):
            l1.append(e)
    return l1
n=int(input("Enter number of sales\n"))
l1=[]
print("Enter your sales")
for i in range(n):
    l1.append(input())
t=int(input("Enter threshold\n"))
l2=newArr(l1,t)
print(l2)


