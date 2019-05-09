package dp;
import java.util.Scanner;

public class 杭电oj1003 {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int c[][]=new int [t][3];
      for(int q=0;q<t;q++)
      {
          int n=sc.nextInt();//n个整数
          int a[]=new int[n];
          int dp[]=new int[n+100];//以第i个元素结尾的最大
          int start=0,valuestart=0;
          int end=0,valuend=0;
          
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
          dp[0]=a[0];
          int dpmax=a[0];
          for(int i=1;i<n;i++)
          {
              end=i;
              dp[i]=max(a[i],dp[i-1]+a[i]);
              if(a[i]>dp[i-1]+a[i]) {start=i;}
              if(dp[i]>dpmax) {valuestart=start;valuend=end;dpmax=dp[i];}//一定要有等于号
          }
          c[q][0]=dpmax;
          c[q][1]=1+valuestart;
          c[q][2]=valuend+1;    
//          System.out.println("Case"+" "+(q+1)+":");
//          System.out.println(dpmax+" "+(1+valuestart)+" "+(valuend+1));
      }
      for(int i=0;i<t;i++)
      {
          System.out.println("Case"+" "+(i+1)+":");
          System.out.println(c[i][0]+" "+c[i][1]+" "+c[i][2]);
          if(i!=t-1)
          System.out.println();
          
      }
      
    }

    private static int max(int i, int j) {
        
        return i>j?i:j;
    }

}