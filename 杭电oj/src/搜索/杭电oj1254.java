package 搜索;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 杭电oj1254 {
    static int x1,y1,x2,y2,x3,y3,m,n;//人 箱子 结束点
    static int x[]= {0,1,0,-1};
    static int y[]= {1,0,-1,0};
    static int a[][];
    static boolean jud=false;
     public static void main(String[] args)  {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();//测试数据
         for(int t1=0;t1<t;t1++)
         {
              m=sc.nextInt();//行
              n=sc.nextInt();//列
             a=new int[m][n];
              boolean mark[][]=new boolean[m][n];
              int mark2[][]=new int[m][n];
             for(int i=0;i<m;i++)
             {
                 for(int j=0;j<n;j++)
                 {
                     a[i][j]=sc.nextInt();
                     if(a[i][j]==4) {x1=i;y1=j;a[i][j]=0;}//人的位置
                     if(a[i][j]==2) {x2=i;y2=j;a[i][j]=0;}//箱子的位置
                     if(a[i][j]==3) {x3=i;y3=j;a[i][j]=0;}//结束点的位置
                 }
             }
             mark[x2][y2]=true;
             Queue<xiang> q2=new PriorityQueue<xiang>(comepare);
             q2.add(new xiang(x2,y2,x1,y1,0));
             while(!q2.isEmpty())
             {
                 xiang xiang=q2.poll();
                 int x4=xiang.xx;int y4=xiang.yx;//箱子
                 int x5=xiang.xr;int y5=xiang.yr;//ren
                 if(x4==x3&&y4==y3){System.out.println(xiang.time);jud=true;break;}
                 else for(int i=0;i<4;i++)
                 {
                     if(x4+x[i]>=0&&x4+x[i]<m&&y4+y[i]>=0&&y4+y[i]<n)//不出届
                     {
                        // System.out.print("ces"+" ");
                         if((a[x4+x[i]][y4+y[i]]==0||a[x4+x[i]][y4+y[i]]==3)&&x4-x[i]>=0&&x4-x[i]<m&&y4-y[i]>=0&&y4-y[i]<n)//目的点满足条件 去推的那点不出届
                         {
                             if(a[x4-x[i]][y4-y[i]]==0)
                             {
                            // System.out.print("cs"+" ");
                             if(move(x5,y5,x4-x[i],y4-y[i],x4,y4)&&!mark[x4+x[i]][y4+y[i]])//可以移动
                             {
                                // System.out.println(x5+" "+y5+"dao"+(x4-x[i])+" "+(y4-y[i]));
                                 mark2[x4+x[i]][y4+y[i]]++;
                                 q2.add(new xiang(x4+x[i],y4+y[i],x4,y4,xiang.time+1));
                                 if(mark2[x4+x[i]][y4+y[i]]>2)
                                 mark[x4+x[i]][y4+y[i]]=true;
                             }
                             }
                         }
                     }
                 }
             }
             if(!jud) {System.out.println(-1);}
             jud=false;
            // System.out.println(move(1,3,1,1,a));//测试
         }
     }
public static boolean move(int x11,int y11,int x21,int y21,int x41,int y41 )//起始点，末尾，箱子
{
    boolean b[][]=new boolean[m][n];
    Queue<zuobiao> q1=new ArrayDeque<zuobiao>();
    b[x11][y11]=true;
    b[x41][y41]=true;
    q1.add(new zuobiao(x11,y11));
    //if(b[x11][y11]!=0||b[x21][y21]!=0) {return false;}//
    //System.out.println(x11+" "+y11+"dao "+x21+" "+y21);
    while(!q1.isEmpty())
    {
        zuobiao zuo=q1.poll();
        int x31=zuo.x;int y31=zuo.y;
        if(x31==x21&&y31==y21){return true;}
        else for(int i=0;i<4;i++)
        {
            if(x31+x[i]>=0&&x31+x[i]<m&&y31+y[i]>=0&&y31+y[i]<n)//不出届
            {
                //if(x31+x[i]==x41&&y31+y[i]==y41) {continue;}//箱子不能走
                {
                if(!b[x31+x[i]][y31+y[i]]&&a[x31+x[i]][y31+y[i]]==0)
                {
                    q1.add(new zuobiao(x31+x[i],y31+y[i]));
                    b[x31+x[i]][y31+y[i]]=true;
                    //System.out.print((x31+x[i])+" "+(y31+y[i])+"    ");
                }
            }}
        }
    }
    return false;
}
static Comparator<xiang>comepare=new Comparator<xiang>()
{
    public int compare(xiang arg0, xiang arg1) {
        return(int) (arg0.time-arg1.time);
    }};
private     static class xiang
 {
        int xx;
        int yx;//箱子
        int xr;
        int yr;//人
        int time;
        public xiang(int xx,int yx,int xr,int yr,int time)
        {
            this.xx=xx;
            this.yx=yx;
            this.xr=xr;
            this.yr=yr;
            this.time=time;
        }
 }
private static class zuobiao
{
    int x;
    int y;
    public zuobiao(int x,int y)
    {
        this.x=x;
        this.y=y;
    }        
}
}