package ����;
import java.util.Scanner;
public class ����oj1010 {
    static int d[][]= {{-1,0},{0,-1},{1,0},{0,1}};//��������
    static boolean judgle=false;
    static int n,m,t,x2,y2;
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           
           while(sc.hasNext())
           {
//             int  n=sc.nextInt();//����
//             int   m=sc.nextInt();//����
//             int   t=sc.nextInt();//�Ŵ򿪵�ʱ��
               n=sc.nextInt();//����
                m=sc.nextInt();//����
                t=sc.nextInt();//�Ŵ򿪵�ʱ��
               sc.nextLine();
               if(n==0&&m==0&&t==0)break;
               char a[][]=new char[n][m];
              boolean  b[][]=new boolean[n][m];//�ж��Ƿ����ϰ�
               boolean c[][]=new boolean[n][m];//�߹���¼
               int x1=0,y1=0;
               for(int i=0;i<n;i++)//��ֵ
               {
                   String exa=sc.nextLine();                   
                   a[i]=exa.toCharArray();
               }
               for(int i=0;i<n;i++)//��ֵ
               {
                   for(int j=0;j<m;j++)//��ֵ
                   {
                       if(a[i][j]=='X') {b[i][j]=true;}//���ϰ�
                       else if(a[i][j]=='S') {x1=i;y1=j;}//���
                       else if(a[i][j]=='D') {x2=i;y2=j;}//������
                   }
               }
               c[x1][y1]=true;
              // if((x1+y1+x2+y2)%2+t%2==1) {judgle=false;}               
                if(t>=m*n) {judgle=false;}//ʱ�䳬��
             //  else if(t<Math.abs(y1-y2)+Math.abs(x2-x1)) {judgle=false;}
//                 
               else {
              dfs(b,c,x1,y1);}
               if(judgle) {System.out.println("YES");judgle=false;}
               else
                   {System.out.println("NO");}
               
           }              
    }
    //private static void dfs( boolean[][] b,boolean c[][], int x1, int y1, int x2, int y2,int m,int n,int t) {
    private static void dfs( boolean b[][], boolean c[][], int x1, int y1) {    
        if(t==0) {if(x1==x2&&y1==y2)judgle=true;return;}    //�����յ�
        else if((x1+y1+x2+y2)%2+t%2==1) {return;}    
        else if(t<Math.abs(y1-y2)+Math.abs(x2-x1)) {return;}
        else
        {
            for(int i=0;i<4;i++)
            {
                int x=x1,y=y1;
                if(x1+d[i][1]<0||y1+d[i][0]<0||x1+d[i][1]>=n||y1+d[i][0]>=m){continue;}//��Խ��
                else
                {
                    if(!b[x1+d[i][1]][y1+d[i][0]]&&!c[x1+d[i][1]][y1+d[i][0]]) //you�ϰ�                
                    {                    
                        x=x+d[i][1];y=y+d[i][0];t--;c[x][y]=true;    
                        if(t==0&&x==x2&&y==y2) {judgle=true;break;}                                                
                        dfs(b,c,x,y);    
                        c[x][y]=false;t++;                    
                    }                
                }                                
            }
        }    
    }
}