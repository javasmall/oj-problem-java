package ˮ;
import java.util.Scanner;

public class ����oj1789 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
      
       for(int TT=0;TT<T;TT++)
       {
           int num=0;
           int time=0;//����
           int n=sc.nextInt();//��������
           int a[]=new int[n];//�������
           int b[]=new int[n];//������
           int c[]=new int[10000];
           boolean[] d=new boolean[n];
           for(int i=0;i<n;i++)
           {a[i]=sc.nextInt(); }
           for(int i=0;i<n;i++)
           {b[i]=sc.nextInt();}
           for(int i=0;i<n;i++)//���ս�����������
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
                   if(b[j]==b[i]&&a[i]>a[j])//��ͬ���ڴ�������
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