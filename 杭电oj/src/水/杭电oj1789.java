package 水;
import java.util.Scanner;

public class 杭电oj1789 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
      
       for(int TT=0;TT<T;TT++)
       {
           int num=0;
           int time=0;//次数
           int n=sc.nextInt();//功课数量
           int a[]=new int[n];//最后期限
           int b[]=new int[n];//降分数
           int c[]=new int[10000];
           boolean[] d=new boolean[n];
           for(int i=0;i<n;i++)
           {a[i]=sc.nextInt(); }
           for(int i=0;i<n;i++)
           {b[i]=sc.nextInt();}
           for(int i=0;i<n;i++)//按照截至日期升序
           {
               for(int j=i;j<n;j++)
               {
                   if(b[i]<b[j])
                   {
                       int tem=a[i];
                       a[i]=a[j];
                       a[j]=tem;
                       tem=b[i];
                       b[i]=b[j];
                       b[j]=tem;
                   }
                   if(b[j]==b[i]&&a[i]>a[j])//相同日期大的在左边
                   {
                      int tem=b[i];
                       b[i]=b[j];
                       b[j]=tem;
                   }
               }
           }
          
           for(int i=0;i<n;i++)
          {
               if(c[a[i]-1]==0) {c[a[i]-1]=b[i];}
               else if(c[a[i]-1]!=0)
               {
                   for(int j=a[i]-1;j>=0;j--)
                   {
                       if(c[j]==0) {c[j]=b[i];break;}
                       else if(j==0&&c[0]!=0) {num=num+b[i];}
                   }
               }
           }
           System.out.println(num);
       }
    }
}