package dp;
import java.util.Scanner;
/*
 * 暴力破解超时
 * dp
 */
public class 杭电oj1231 {
    public static void main(String[] args) 
    {    
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               boolean c=false;
               int n=sc.nextInt();
               if(n==0)break;
               
               int a[]=new int[n+1];
               int dp[]=new int[n+1];
               int low[]=new int[n+1];
               for(int i=1;i<n+1;i++)
               {
                   a[i]=sc.nextInt();
                   if(a[i]>=0)c=true;
               }
               dp[1]=a[1];
               low[1]=a[1];
               int value=dp[1];
               int low1=a[1];int high1=a[1];
               for(int i=1;i<n+1;i++)
               {
                   dp[i]=max(a[i],dp[i-1]+a[i]);
                   if(dp[i]==a[i])
                   {
                       low[i]=a[i];
                   }
                   if(dp[i]!=a[i])
                   {
                       low[i]=low[i-1];
                   }
                   if(value<dp[i])
                   {
                       value=dp[i];
                       low1=low[i];
                       high1=a[i];
                   }
               }
//               for(int i=0;i<n;i++)
//               { 
//                  
//                   int team=0;
//                   for(int j=i;j<n;j++)
//                   {
//                       team+=a[j];
//                       if(team>value)
//                       {
//                           low=a[i];
//                           high=a[j];
//                           value=team;
//                       }
//                   }
//               }
               if(!c) {   System.out.println(0+" "+a[1]+" "+a[n]);}
               else
               System.out.println(value+" "+low1+" "+high1);
           }       
    }

    private static int max(int i, int j) {
        // TODO 自动生成的方法存根
        return i>j?i:j;
    }
}