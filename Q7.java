import java.util.*;
static int gcd(int a,int b)
{
    a=Math.abs(a);
    b=Math.abs(b);
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}
static int gcd_array(int arr[])
{
    int result=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if (result==1) break;
        result=gcd(arr[i],result);
    }
    return result;
}
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter your elements");
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    System.out.println(gcd_array(arr));
    sc.close();
}
