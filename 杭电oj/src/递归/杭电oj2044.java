package µÝ¹é;
import java.util.Scanner;

public class º¼µçoj2044
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long s[]=new long[50];
        long q[]=new long[n];
        for(int i=0;i<50;i++)
        {
            if(i==0) {s[0]=1;}
            if(i==1) {s[1]= 2;}
            if(i>=2)
                s[i]=s[i-1]+s[i-2];
        }
        for(int i=0;i<n;i++)
        {
            int number=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=b-a;
            q[i]=s[c-1];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(q[i]);
        }
                
    }

}