import java.util.*;
class Q2 {
    static int twiceRev(int n)
    {
        int a=n;
        if (a<0)
            a=-a;
        int s=0;
        while(a>0)
        {
            int ld=a%10;
            s=s*10+ld;
            a=a/10;
        }
        if(n<0) return -2*s;
        return 2*s;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        System.out.println(twiceRev(n));
        sc.close();

    }
    
}
