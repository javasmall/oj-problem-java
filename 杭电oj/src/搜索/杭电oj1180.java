package 搜索;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 杭电oj1180 {
    static int x[]={0,1,0,-1};
    static int y[]={1,0,-1,0};//右 上 做 下 
    static int m,n;        
    static int x1=0,y1=0,x2=0,y2=0;//起点和抹点
    static char a[][]=new char[20][20];
    public static void main(String[] args)  {
         Scanner sc=new Scanner(System.in);
                  
         while(sc.hasNext())
         {                      
              m=sc.nextInt();//行   
              n=sc.nextInt();//列   
              sc.nextLine();
             // char a[][]=new char[m][n];
              boolean b[][]=new boolean[m][n];//表示横的
                // boolean b2[][]=new boolean[n][m];//表示竖的
                                          
             for(int i=0;i<m;i++)
             {
                 String a1=sc.nextLine();
                 a[i]=a1.toCharArray();                
             }                
             for(int i=0;i<m;i++)
             {
                 for(int j=0;j<n;j++)
                 {
                     if(a[i][j]=='S') {x1=i;y1=j;}
                     if(a[i][j]=='T') {x2=i;y2=j;}
                    // if(a[i][j]=='-') {b[i][j]=true;}//记录横的
                    // if(a[i][j]=='|') {b2[i][j]=true;}//记录竖的
                 }
             }        
             b[x1][y1]=true;
             //System.out.print(x1+" "+y1+" "+x2+" "+y2);
             bfs(b);
                          
             }
    }
private static void bfs(boolean b[][]) 
{
    Queue<zuobiao> q1=new PriorityQueue<zuobiao>(timecomepare2);
     //Queue<zuobiao> q1=new LinkedList<zuobiao>();
     q1.add(new zuobiao(x1,y1,0));
     while(!q1.isEmpty())
     {
         zuobiao zuo=q1.poll();//取头
         int x3=zuo.x;int y3=zuo.y;    
         //q1.add(new zuobiao(x3,y3,zuo.time+1));
         if(x3==x2&&y3==y2) {System.out.println(zuo.time);break;}
         else                 
         for(int i=0;i<4;i++)
         {            
              if(x3+x[i]<m&&x3+x[i]>=0&&y3+y[i]<n&&y3+y[i]>=0&&!b[x3+x[i]][y3+y[i]])    //这个点没有访问过                    
             {                         
                 if(a[x3+x[i]][y3+y[i]]=='.')//普通情况，不考虑楼梯
                 {
                     b[x3+x[i]][y3+y[i]]=true;
                     q1.add(new zuobiao(x3+x[i],y3+y[i],zuo.time+1));                    
                 }
                 /*
                  * 遇到竖直楼梯，1：上下方向的偶时间可行
                  *              2：左右方向的奇时间可行
                  */
                  if(a[x3+x[i]][y3+y[i]]=='|')//竖直楼梯只能上下走，走两步
                 {
                    if(zuo.time%2==1&&(i==0||i==2))//奇数时间                            
                    {
                        if(y3+y[i]+y[i]<n&&y3+y[i]+y[i]>=0)
                        {   b[x3+x[i]+x[i]][y3+y[i]+y[i]]=true;
                            q1.add(new zuobiao(x3+x[i]+x[i],y3+y[i]+y[i],zuo.time+1));}
                    }
                    else if(zuo.time%2==0&&(i==1||i==3))//奇数时间                                                    
                    {
                        if(x3+x[i]+x[i]<m&&x3+x[i]+x[i]>=0)
                        {         b[x3+x[i]+x[i]][y3+y[i]+y[i]]=true;                            
                            q1.add(new zuobiao(x3+x[i]+x[i],y3+y[i]+y[i],zuo.time+1));
                        }                            
                    }    
                else if(y3+y[i]+y[i]<n&&y3+y[i]+y[i]>=0&&x3+x[i]+x[i]<m&&x3+x[i]+x[i]>=0) {
                    if(b[x3+x[i]+x[i]][y3+y[i]+y[i]]==false)q1.add(new zuobiao(x3,y3,zuo.time+1));}
                }
                 /*
                  * 遇到-方向 1：偶数时间左右方向
                  *          2：奇数时间的上下方向 
                  */
                  if(a[x3+x[i]][y3+y[i]]=='-')//竖直楼梯只能左右走，走两步
                 {
                     if(zuo.time%2==1&&(i==1||i==3))//左右
                     {
                    if(x3+x[i]+x[i]<m&&x3+x[i]+x[i]>=0)
                         {         b[x3+x[i]+x[i]][y3+y[i]+y[i]]=true;                             
                             q1.add(new zuobiao(x3+x[i]+x[i],y3+y[i]+y[i],zuo.time+1));
                         }
                     }
                     else   if(zuo.time%2==0&&(i==0||i==2))//奇数时间上下                            
                     {
                         if(y3+y[i]+y[i]<n&&y3+y[i]+y[i]>=0)//符合条件
                         {         b[x3+x[i]+x[i]][y3+y[i]+y[i]]=true;                                 
                             q1.add(new zuobiao(x3+x[i]+x[i],y3+y[i]+y[i],zuo.time+1));
                         }
                     }    
                 else if(y3+y[i]+y[i]<n&&y3+y[i]+y[i]>=0&&x3+x[i]+x[i]<m&&x3+x[i]+x[i]>=0)
                 {if(b[x3+x[i]+x[i]][y3+y[i]+y[i]]==false)q1.add(new zuobiao(x3,y3,zuo.time+1));}
                 }
                   if (a[x3+x[i]][y3+y[i]]=='T')
                 {     b[x3+x[i]][y3+y[i]]=true;
                      q1.add(new zuobiao(x3+x[i],y3+y[i],zuo.time+1));
                 }    
                 //if(!b[x3+x[i]][y3+y[i]]) {q1.add(new zuobiao(x3,y3,zuo.time+1));}
             }
         }                
     }
        
    }
public static Comparator<zuobiao> timecomepare2 =new Comparator<zuobiao>()//实现comparator接口
{
     public int compare(zuobiao a1,zuobiao a2)
     {
         return (int)(a1.time-a2.time);
     }
    };
}
 class zuobiao
{    
    int x;
    int y;
    int time;    
    public zuobiao(int x,int y,int time)
    {
        this.x=x;
        this.y=y;
        this.time=time;        
    }
}