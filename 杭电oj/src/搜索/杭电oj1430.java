package ����;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ����oj1430 {
    static int jiecheng[]= {1,1,2,6,24,120,720,5040};
    public static void main(String[] args)  {        
         Scanner sc=new Scanner(System.in);        
            
         int jud[]=new int[40321];
          String path[]=new String[40321];
         
          char start[]= {'1','2','3','4','5','6','7','8'};
          path[kangtuo(start)]="";//��ʼ��һ������Ԫ����""������null        
            Queue<char[]>q1=new ArrayDeque();
         q1.add(start);        
         while(!q1.isEmpty())
         {
             char t2[]=q1.poll();  //ȥͷ������
             int exam=kangtuo(t2);//��ǰ�Ŀ���չ��ֵ
             jud[exam]=1;
                 {      
                 char p1[]=a(t2);int kang=kangtuo(p1);//�ֱ������������ж��Ƿ����
                 //q1.add(p1);path[kang]=path[exam]+'A';
                 if(jud[kang]==0) {q1.add(p1);path[kang]=path[exam]+'A';jud[kang]=1; }
                 char p2[]=b(t2); kang=kangtuo(p2);
             //    q1.add(p2);path[kang]=path[exam]+'B';
                 if(jud[kang]==0) {q1.add(p2);path[kang]=path[exam]+'B'; jud[kang]=1;}
                 char p3[]=c(t2); kang=kangtuo(p3);
                 //q1.add(p3);path[kang]=path[exam]+'C';
                 if(jud[kang]==0) {q1.add(p3);path[kang]=path[exam]+'C';jud[kang]=1; }
                 
             } 
             
         } 
        while(sc.hasNextLine())
        {  
            String c=sc.nextLine();//��ʼ״̬            
            String d=sc.nextLine();//����״̬   
            char c1[]=c.toCharArray();
            char d1[]=d.toCharArray();//ת��Ϊ�ַ�����
          d1=  zhuanhua(c1,d1);
            System.out.println(path[kangtuo(d1)]);                                           
        }
    }
    private static char[] zhuanhua(char[] c1, char[] d1) {
    //char x[]=c1.clone();
    for(int i=0;i<8;i++)
    {
        for(int j=0;j<8;j++)
        {if(d1[i]==c1[j]) {d1[i]=(char) (j+1+'0');break;}}
    }
    return d1;
    
        
    }
    static int kangtuo(char a[])//ת��Ϊ����չ����ֵ
    {
        int m=0,n=0;
        for(int i=0;i<8;i++)
        {
            m=0;
            for(int j=i+1;j<8;j++)
            {
                if(a[i]>a[j])m++;
            }
            n+=m*jiecheng[7-i];
        }
        return n;        
    }
 static void swap(char a[],int b,int c)
    {         
        char tem=a[b];
        a[b]=a[c];
        a[c]=tem;            
    }    
private    static char[] a(char b[])//a��ʵ�ַ���
    {
        char a[]=b.clone();//��ֵb���鲻�ı�b����
        swap(a,0,7);
        swap(a,1,6);
        swap(a,2,5);
        swap(a,3,4);
        return a;
    }
    static char[] b(char b[])
    {
        char a[]=b.clone();
        swap(a,3,2);
        swap(a,2,1);
        swap(a,1,0);
        swap(a,4,5);
        swap(a,5,6);
        swap(a,6,7);
        return a;
    }
    static char[] c(char b[])
    {
        char a[]=b.clone();
        swap(a,1,6);
        swap(a,2,6);
        swap(a,5,6);    
        return a;
    }        

}