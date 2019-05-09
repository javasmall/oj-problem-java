package 水;
import java.util.Scanner;

public class 杭电oj1260{
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);     
           int n=sc.nextInt();//n个不同的场景
           int value[]=new int[n];//储存结果
           for(int i=0;i<n;i++)
           {
               int k=sc.nextInt();//总人数
               int dp[]=new int[k+1];
               int dan[]=new int[k+1];//单人所需要的时间
               for(int j=1;j<k+1;j++)
               {
                   dan[j]=sc.nextInt();
               }
               if(k==1) {value[i]=dan[1];}
               else //双人票时间
               {
                   int shuang[]=new int[k];
                   for(int j=1;j<k;j++)
                   {
                       shuang[j]=sc.nextInt();
                   }
                   dp[1]=dan[1];
                   for(int j=2;j<k+1;j++)
                   {
                       dp[j]=min(dp[j-1]+dan[j],dp[j-2]+shuang[j-1]);
                   }
                   value[i]=dp[k];
                }    
               int hour=value[i]/3600;
               int min=value[i]%3600/60;
               int second=value[i]%60;
            String    timeStr = unitFormat(hour+8) + ":" + unitFormat(min) + ":" + unitFormat(second);
               if((hour+8)/12%2==0)
               {System.out.println(timeStr+" am");}
               else
               {System.out.println(timeStr+" pm");}
           }    
//           for(int i=0;i<n;i++)
//           {
//              
//           }
   }

    private static String unitFormat(int i) {
        // TODO 自动生成的方法存根
        String retStr = null;
        if (i >= 0 && i < 10)
            retStr = "0" + Integer.toString(i);
        else
            retStr = "" + i;
        return retStr;
    }

    private static int min(int i, int j) {
        // TODO 自动生成的方法存根
        return i<j?i:j;
    }
}