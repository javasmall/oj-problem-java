package dp;
import java.util.Scanner;
/*
 * 数塔
 */
public class 杭电oj2084 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0)
           {
               int n=sc.nextInt();//高度
               int a[][]=new int[n+2][n+2];//赋值
               int dp[][]=new int[n+3][n+3];
               for(int i=1;i<n+1;i++)
               {
                   for(int j=1;j<i+1;j++)
                   {
                       a[i][j]=sc.nextInt();
                   }
               }              
               for(int i=n;i>=1;i--)
               {
                   for(int j=1;j<i+1;j++)
                   {
                       dp[i][j]=max(dp[i+1][j],dp[i+1][j+1])+a[i][j];
                   }
               }
               System.out.println(dp[1][1]);
           }
    }

    private static int max(int i, int j) {
        // TODO 自动生成的方法存根
        return i>j?i:j;
    }
}