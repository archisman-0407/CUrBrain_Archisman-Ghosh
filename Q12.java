import java.util.*;
public class Q12 {
    static int powerCalc(int base,int power,int Mod)
    {
        int f=1;
        while(power>0)
        {
            f*=base;
            power--;
        }
        return f%Mod;
    }    
    public static void main()
    {
        int p,b,mod;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base,power,exponent");
        b=sc.nextInt();
        p=sc.nextInt();
        mod=sc.nextInt();
        System.out.println(powerCalc(b,p,mod));
        sc.close();
    }
}
