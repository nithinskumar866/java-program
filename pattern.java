import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        
        int data[] = new int[size];
        
        System.out.print("enter element");
        int low = data[0];
        int high=data[size-1];
        int res=-1;
        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }
        System.out.println("enter target");
        
        int target=sc.nextInt();
        while (low<=high) {
            int mid=(high+low)/2;
            if(data[mid]==target)
            {
                res=mid;
                break;
            }
            if(data[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(res!=-1)
        {
            System.out.println("pos"+res);
        }
        else{
            System.out.println("not available");
        }

    }
}
