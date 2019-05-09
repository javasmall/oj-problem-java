package dp;
import java.util.Scanner;
/*
 * 数塔问题。倒过来看
 */
public class 杭电oj1176 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               int n=sc.nextInt();
               if(n==0)break;
               int max=0;
             int a[][]=new int[100003][13];
               long dp[][]=new long[100003][13];
               for(int i=0;i<n;i++)
               {
                   int x1=sc.nextInt();//位置
                   int t1=sc.nextInt();//时间
                   if(t1>max)
                   {max=t1;}
                   a[t1][x1+1]++;
               }
               
               for(int i=max;i>=0;i--)
               {
                   for(int j=1;j<12;j++)
                   {
                       dp[i][j]=max(dp[i+1][j-1],dp[i+1][j],dp[i+1][j+1])+a[i][j];
                   }
               }
               System.out.println(dp[0][6]);
           }
    }

    private static long max(long i, long j, long k) {
        if(i<j)i=j;
        return i>k?i:k;
    }
}