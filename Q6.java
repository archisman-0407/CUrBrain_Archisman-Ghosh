import java.util.*;
class Q6 {
    static int freqCountDiff(int n,int a,int b)
    {
        if(a==b) return 0;
        if (n==0 && (a==0 || b==0)) return 1;
        if(n<0)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        if(!(a>=0 && a<=9))
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
       if(!(b>=0 && b<=9))
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int n1=n;
        int c1=0;
        int c2=0;
        while(n1>0)
        {
            int ld=n1%10;
            if(ld==a)            
                c1++;
            else if(ld==b)
                c2++;
            n1=n1/10;
        }
        return Math.abs(c1-c2);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of n, a and b");
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(freqCountDiff(n,a,b));
        sc.close();        
    }  
}
