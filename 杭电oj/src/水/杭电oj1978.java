package 水;

import java.util.Scanner;
public class 杭电oj1978 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           int T=sc.nextInt();//数据个数
           for(int t=0;t<T;t++)
           {
               int n=sc.nextInt();//行数
               int m=sc.nextInt();//列数
               int a[][]=new int[n+1][m+1];//能量
               int dp[][]=new int[n+1][m+1];
               for(int i=1;i<n+1;i++)
               {
                   for(int j=1;j<m+1;j++ )
                   {a[i][j]=sc.nextInt();}
               }
               dp[1][1]=1;
//               for(int i=1;i<n+1;i++)
//               {
//                   for(int j=1;j<m+1;j++ )
//                   {                       
//                       for(int i1=1;i1<i+1;i1++)
//                       {
//                           for(int j1=1;j1<j+1;j1++)
//                           {
//                               if(i1!=i||j1!=j) 
//                               {if(a[i1][j1]>=(i-i1+j-j1))
//                                   dp[i][j]+=dp[i1][j1]%10000;}
//                           }
//                       }
//                   }
//               }
               /*
                * 第二种
                */
               for(int i=1;i<n+1;i++)
               {
                   for(int j=1;j<m+1;j++ )
                   {                       
                       for(int i1=i;i1<n+1;i1++)
                       {
                           for(int j1=j;j1<m+1;j1++)
                           {
                               if(i1!=i||j1!=j) 
                               {if(a[i][j]>=(i1-i+j1-j))
                                   dp[i1][j1]+=dp[i][j]%10000;}
                           }
                       }
                   }
               }
               
               System.out.println(dp[n][m]%10000);
                                  
           }           
    }
}