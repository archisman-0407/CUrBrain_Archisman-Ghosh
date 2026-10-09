static boolean prime(int n)
{
    if(n==0 || n==1) return false;
    if(n==2) return true;
    if(n%2==0) return false;
    for(int i=3;i<=Math.sqrt(n);i+=2)
        if(n%i==0) return false;
    return true;
}
static int next_prime(int n)
{
    if(n<2) return 2;
    n+=1;
    while(!prime(n))
    {
        n+=1;
    }
    return n;    
}
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int n=sc.nextInt();
    System.out.println(next_prime(n));
    sc.close();
}