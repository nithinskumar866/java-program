import java.util.*;

public class two {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("hi john ,\"aadhi is a ____\"");
         * int a=110;
         * int b=10;
         * 
         * System.out.println(b);
         * System.out.printf("%015d",b);
         * String s1="hi";
         * String s2="bro";
         * System.out.print(hi);
         * int a=sc.nextInt();
         * boolean voter=sc.nextBoolean();
         * if (a>=18 && voter==true) {
         * System.out.println("TVK");
         * 
         * }
         * if(voter==false)
         * {
         * System.out.println("applyfor voter id ");
         * }
         * if(a<=18)
         * {
         * System.out.println("come after your \"18th\" bday");
         * }
         * else {
         * System.out.println("take leave, rest urself");
         * }
         */
        /*int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (year > 1900 && year < 2100) {
            if (month > 1 && month < 12) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (date > 1 && date < 31) {
                        System.out.println("valid");
                    }
                }
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (date > 1 && date < 30) {
                        System.out.println("valid");
                    } else {
                        System.out.println(month + "has only 30 days");
                    }
                }
                if (month == 2) {
                    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                        System.out.println("leap");
                    } else {
                        System.out.println("not leap");
                    }
                }
            }
        }

        else {
            System.out.println("no");
        }*/
        /*int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            System.out.println(i);
        }

        
        for(int i=a;i<=b;i)
        {
            System.out.println(i);
        }*/
        int a =4838;
        int sum=0;

        while (a>0) 
        {
             sum+=a/10;
             a=a%10;      
              
        }
        System.out.println(sum); 
        
    }
}
