package dp;
import java.util.Scanner;

public class ����oj1087 {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
        
        int n=sc.nextInt();
        if(n==0)break;
        int dp[]=new int[n];//�Ե�i��Ԫ�ؽ�β����������С������һ��һ����a[i]�ģ�    
        int a[]=new int[n];
        int max=0;//������г���
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        dp[0]=a[0];
        max=dp[0];
        for(int i=1;i<n;i++)
        {
            int m=0;
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i]&&dp[j]>m)
                {
                    m=dp[j];
                }
            }
            dp[i]=m+a[i];
            if(dp[i]>max)
            {
                max=dp[i];
            }
        }
        System.out.println(max);
        }
    }
}