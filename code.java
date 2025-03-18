import java.util.Scanner;

public class code {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        
        for(int i=0;i<sz;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<sz;i++)
        {
            for(int j=0;j<sz;j++)
            {
                if(arr[i]!=arr[j])
                {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
