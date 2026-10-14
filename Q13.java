import java.util.*;
public class Q13 {
    static boolean prefixDiv(int arr[],int k)
    {
        if (arr[0]%k==0) return true;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum%k==0) return true;
        }
        return false;
    }
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println(prefixDiv(arr,k));
        sc.close();       
    }   
}
