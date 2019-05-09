package hash;
import java.util.Arrays;
import java.util.Scanner;

public class º¼µçoj1425 {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[1000000];
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,0,n);
            for(int i=0;i<m;i++)
            {
                if(i==m-1) {System.out.println(a[n-i-1]);}
                else System.out.print(a[n-i-1]+" ");
            }
        }
    }
}