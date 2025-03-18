import java.util.*;
public class arrayssort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        for(int i=0;i<sz;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<sz;i++)
        {
            for(int j=0;j<sz;j++)
            {
                if(arr[i]>arr[j])
                {
                    
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
