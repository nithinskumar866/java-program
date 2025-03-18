import java.util.*;
public class oddeve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter");
    int sz=sc.nextInt();
    int arr[]=new int[sz];
    for(int i=0;i<sz;i++)
    {
        arr[i]=sc.nextInt();
    }
    for (int i=0;i<sz;i++)
    {
        if(arr[i]%2==0)
        {
            System.out.print(arr[i]+" ");
        }
       
    }
    for (int i=0;i<sz;i++)
    {
        if(arr[i]%2!=0)
        {
            System.out.print(arr[i]+" ");
        }
       
    }
    }
    
}
