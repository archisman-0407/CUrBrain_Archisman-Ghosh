import java.util.*;
public class Q15 {
    static int smallAbs(int arr[]){
        int minIdx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(arr[i])<Math.abs(arr[minIdx]))
                minIdx=i;
        }
        return arr[minIdx];
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(smallAbs(arr));
        sc.close();      
    }
}
