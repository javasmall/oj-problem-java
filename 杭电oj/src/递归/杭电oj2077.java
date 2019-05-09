package µÝ¹é;
import java.util.Scanner;

public class º¼µçoj2077 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long a[]=new long[21];
        a[0]=0;
        a[1]=2;
        
        for(int i=2;i<21;i++)
        {
            a[i]=3*a[i-1]+2;
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int j=sc.nextInt();
            System.out.println(a[j-1]+2);
        }
    }

}