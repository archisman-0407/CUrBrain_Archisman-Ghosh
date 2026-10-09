import java.util.Arrays;
static int sieve(int n)
{
    boolean s[]=new boolean[n+1];
    Arrays.fill(s,true);
    s[0]=false;
    s[1]=false;
    for(int i=2;i*i<=n;i++)
    {
        if(s[i])
        {
            for(int j=i*i;j<=n;j+=i)
                s[j]=false;
        }
    }
    int c=0;
    for(int i=0;i<s.length;i++)
        if(s[i]) c++;
    return (c);  
}
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int n=sc.nextInt();
    if(n==0)
    {
        System.out.println(0);
        System.exit(0);
    }
    System.out.println(sieve(n-1));
    sc.close();
}


