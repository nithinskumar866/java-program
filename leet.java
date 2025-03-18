import java.util.Arrays;
import java.util.Scanner;

public class leet {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        int sum=0;
        for(int i=0;i<sz;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<sz;i++)
        {
            sum=sum*10+arr[i];
            
        }
        System.out.print(sum);
        sum=sum+1;

        String str=String.valueOf(sum);

        for(int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i);
        }
               System.out.println(str);

        System.out.println(Arrays.toString(arr));
    }
}
