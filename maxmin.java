import java.util.*;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        for(int i=0;i<sz;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // for(int i=0;i<sz;i++)
        // {
            
        // }
        System.out.println("min"+arr[0]);
        System.out.println("max"+ arr[arr.length-1]);

    }
}
