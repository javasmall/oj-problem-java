package dp;
import java.util.Scanner;

public class 杭电oj1069 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           int time=0;
           while(sc.hasNext())
           {
               time++;
               int n=sc.nextInt();//测试用例
               if(n==0)break;
               kuai k[]=new kuai[n*3+1];
               int dp[]=new int[n*3+1];
               int value=0;
               for(int i=0;i<n;i++)
               {
                   int a1=sc.nextInt();
                   int a2=sc.nextInt();
                   int a3=sc.nextInt();
                   k[i*3+1]=new kuai(a1,a2,a3);
                   k[i*3+2]=new kuai(a2,a1,a3);
                   k[i*3+3]=new kuai(a3,a2,a1);
               }
               for(int i=1;i<n*3+1;i++)
               {
                   for(int j=i;j<n*3+1;j++)
                   {
                       if(k[i].mianji>k[j].mianji)
                       {kuai team=k[i];k[i]=k[j];k[j]=team;}
                   }
               }
               dp[1]=k[1].heiht;//以第一个为截至
               for(int i=1;i<n*3+1;i++)//以第i个为截止的dp
               {
                   int max=0;
                   for(int j=1;j<i;j++)
                   {
                       if(k[j].chang<k[i].chang&&k[j].kuan<k[i].kuan)
                       { 
                           if(dp[j]>max) {max=dp[j];}
                       }
                   }
                   dp[i]=max+k[i].heiht;
                   if(dp[i]>value)
                   {
                       value=dp[i];
                   }
               }
               System.out.println("Case "+time+": maximum height = "+ value);
//               for(int i=0;i<n*3;i++)//测试
//               {
//                   System.out.println(k[i].heiht+" "+k[i].chang+" "+k[i].kuan+" "+k[i].mianji);
//               }
           }
           
    }
}
class kuai
{
    int heiht;
    int chang;
    int kuan;
    int mianji;
    public kuai(int a,int b,int c)
    {
        this.heiht=a;
        this.chang= b>c?b:c;
        this.kuan=b<c?b:c;
        this.mianji=b*c;
    }
}