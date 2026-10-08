def listreturn(n):
    if(n<0):
        print("Invalid Input")
    else:
        a=int(n)
        l1=[]
        while(a>0):
            ld=a%10
            if(ld%2==0):
                l1.insert(0,0)
            else:
                l1.insert(0,ld)
            a=a//10
        return l1
n=int(input("Enter a number\n"))
print(listreturn(n))


