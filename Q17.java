import java.util.*;
public class Q17 {
    static int mostPopular(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for (int e:arr){
            map.put(e,map.getOrDefault(e, 0)+1);
        }
        int maxfreq=-1;
        int mostPopularId=Integer.MAX_VALUE;
        for(int k:map.keySet()){
            int curfreq=map.get(k);
            if(curfreq>maxfreq){
                maxfreq=curfreq;
                mostPopularId=k;
            }
            if(curfreq==maxfreq){
                if(k<mostPopularId){
                    mostPopularId=k;
                }
            }
        }
        return mostPopularId;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of product IDs");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your product IDs");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Most popular ID: "+mostPopular(arr));
        sc.close();
    }
}
