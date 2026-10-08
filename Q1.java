import java.util.*;
class Q1
{
    static boolean isEvendigit(int n)
    {
        if(n==0)
            return false;
        if(n<0)
            n=-n;
        
        int a=n;
        int c=0;
        while(a>0)
        {
            a=a/10;
            c++;
        }
        return (c%2==0);        
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        System.out.println(isEvendigit(n));
        sc.close();
    }
}