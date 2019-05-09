package dp;
import java.util.Scanner;

public class 杭电oj1024 {
    public static void main(String[] args) {                
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               int m=sc.nextInt();//对数
               int n=sc.nextInt();//元素个数
               int a[]=new int[n+1];//元素值
                int dp[][]=new int[2][n+1];
                int value[]=new int[n+1];
            int q=0;int max=0;
               for(int i=1;i<n+1;i++)
               {
                   a[i]=sc.nextInt();
                  
               }          
               //value[1]=-10000;
               for(int i=1;i<m+1;i++)
               {
                   
                   for(int j=i;j<n+1;j++)
                   { 
                       if(j==i) {dp[i%2][j]=dp[(i-1)%2][j-1]+a[j]; value[j]=dp[i%2][j];}
                       else if(j>i)
                       {
                           
//                           for(int k=i-1;k<=j-1;k++)//找到当前dp和右侧的最大
//                           {
//                               q=0;max=a[j];//右侧最大
//                               for(int k2=j;k2>k;k2--)
//                               {
//                                   q+=a[k2];
//                                   if(q>max) {max=q;}
//                                  
//                               }
//                               if(value[j]<max+dp[(i-1)%2][k])
//                                   value[j]=max+dp[(i-1)%2][k];
//                               
//                           }
                          
                           value[j]=max(dp[(i-1)%2][j-1]+a[j],value[j-1]+a[j]);//必须取K时的最大另外取he直接连上        两种方式
                           dp[i%2][j]=max(dp[i%2][j-1],value[j]);//不用第J个和用第J个比较
                       }
                   }
               }
              
               System.out.println(dp[m%2][n]);
           }
        }

        private static int max(int i, int value) {
            
            return i>value?i:value;
        }
    }