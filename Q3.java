import java.util.*;
class Q3
{
    static int palindrome(int n)
    {
        int a=n;
        if(n<0) a=-n;

        int s=0;
        while(a>0)
        {
            int ld=a%10;
            s=s*10+ld;
            a=a/10;
        }
        if(n<0) s=-s;
        if(s==n && n<0) return 2*s;
        if(s==n) return n;
        return n+s;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        System.out.println(palindrome(n));
        sc.close();
    }
}