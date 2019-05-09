package 搜索;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 杭电oj1195 {
    
    public static void main(String[] args)  {        
         Scanner sc=new Scanner(System.in);    
             int t=sc.nextInt();
             int a1[]=new int[4]; int b1[]=new int[4];
             Queue<node> q1=new LinkedList<node>();
             for(int tx=0;tx<t;tx++)
             {
                 int a=sc.nextInt();
                 int b=sc.nextInt();
                 boolean jud[][][][]=new boolean[10][10][10][10];
                 a1[0]=a/1000;a1[1]=a/100%10;a1[2]=a/10%10;a1[3]=a%10;
                 b1[0]=b/1000;b1[1]=b/100%10;b1[2]=b/10%10;b1[3]=b%10;
                 jud[a1[0]][a1[1]][a1[2]][a1[3]]=false;
                 
                 //for(int i=0;i<4;i++) {System.out.println(a1[i]);}测试
//                 String c=String.valueOf(a);
//                 char d[]=c.toCharArray();
                 q1.clear();
                 q1.add(new node(a1,0));
                 while(!q1.isEmpty())
                 {
                     node no=q1.poll();
                     int s1[]=no.a;
                     if(s1[0]==b1[0]&&s1[1]==b1[1]&&s1[2]==b1[2]&&s1[3]==b1[3])
                     {System.out.println(no.time);break; }
                     else {
                         for(int i=0;i<3;i++)
                         {
                             int exam[]=s1.clone();
                             exam=exchange(exam,i);
                             if(!jud[exam[0]][exam[1]][exam[2]][exam[3]])
                             q1.add(new node(exam,no.time+1));jud[exam[0]][exam[1]][exam[2]][exam[3]]=true;
                         }
                     for(int i=0;i<4;i++)
                     {                                          
                         if(s1[i]==b1[i]) {continue;}
                         else {
                             int exam[]=s1.clone();
                         exam[i]=change(exam[i],b1,i);
                         if(!jud[exam[0]][exam[1]][exam[2]][exam[3]])
                         q1.add(new node(exam,no.time+1));jud[exam[0]][exam[1]][exam[2]][exam[3]]=true;}
                         
                     }                     
                 }}
             }             
    }
    private static int[] exchange(int[] exam, int i) {
        int exa=exam[i];
        exam[i]=exam[i+1];
        exam[i+1]=exa;
        return exam;
    }
    private static int change(int value,  int[] b1, int i) {
        if(b1[i]>value) {
            if(b1[i]-value>9-b1[i]+value) //需要减
            {if(value==1) {value=9;}else value--;}
            else//需要加
            {
                if(value==9) {value=1;}
                else value++;
            }
        }
        else if(b1[i]<value)
        {
            if(value-b1[i]<9-value+b1[i]) //需要减
            {
                if(value==1) {value=9;}
                else value--;
            }
            else//需要加
            {
                if(value==9) {value=1;}
                else value++;
            }
        }
        return value;
    }
    static class node
    {
        int a[]=new int[4];
        int time;
        public node(int a[],int time)
        {
            this.a=a;
            this.time=time;
        }
    }
}