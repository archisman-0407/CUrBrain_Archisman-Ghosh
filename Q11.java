import java.util.*;
class Q11
{
static int sumModulo(int arr[]){
    int MOD=(int)Math.pow(10,9)+7;
    int sum=0;
    for(int i=0;i<arr.length;i++)
        sum=(sum+arr[i])%MOD;
    return sum;
}
public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    System.out.println(sumModulo(arr));
    sc.close();
}
}
