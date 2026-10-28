import java.util.*;
public class Q18 {
    static int[] arrRev(int arr[],int start,int end){
        int k=0;
        for(int i=start;i<=end/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[end-k];
            arr[end-k]=temp;
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter start and end");
        int start=sc.nextInt();
        int end=sc.nextInt();
        arr=arrRev(arr,start,end);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
