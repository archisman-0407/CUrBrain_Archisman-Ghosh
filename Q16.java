import java.util.*;
public class Q16 {
    static int secondHigh(int arr[])
    {
        int highest=-1;
        int secondhighest=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>highest)
            {
                secondhighest=highest;
                highest=arr[i];
            }
            if(arr[i]<highest && arr[i]>secondhighest)
                secondhighest=arr[i];
        }
        return secondhighest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(secondHigh(arr));
        sc.close();
    }
    
}
