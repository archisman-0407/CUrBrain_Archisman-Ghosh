import java.util.*;
class Q4 {
    static int diffOfProdandSum(int n)
    {
        if(n<=0)
        {
            System.out.println("Number must be positive");
            System.exit(0);
        }
        int sum=0;
        int prod=1;
        int a=n;
        while(a>0)
        {
            sum+=a%10;
            prod*=a%10;
            a=a/10;
        }
        return (prod-sum);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println(diffOfProdandSum(n));
        sc.close();

    }
    
}
