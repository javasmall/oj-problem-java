package 搜索;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 杭电oj1072 {
    static int n,m,x1=0,y1=0,x2,y2,min,t;
    static int d[][]= {{1,0},{0,-1},{-1,0},{0,1}};//上左下右    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);         
        int T=sc.nextInt();//测试用例            
        while(T-->0)
        {
              min=64;             
            n=sc.nextInt();m=sc.nextInt();//行  列
            int a[][]=new int[n][m];            
            boolean b[][]=new boolean[n][m];//false代表能走（包裹墙为TRUR）
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                     if(a[i][j]==2) {x1=i;y1=j;}
                     if(a[i][j]==3) {x2=i;y2=j;}
                }
            }
            t=6;
            bfs(a);
            if(min!=64) {
            System.out.println(min);}
            else
                System.out.println(-1);            
        }        
    }
    private static void bfs( int[][] a) {
        Queue<node> q1=new PriorityQueue<>(valuecompare);//优先队列
        //min=64;
        q1.add(new node(x1,y1,0,6));
        while(!q1.isEmpty())
        {        
            node exa=q1.poll();//返回头节点并删除            
            int x=exa.x,y=exa.y;
            if(exa.x==x2&&exa.y==y2) {if(exa.time>0&&min>exa.value) {min=exa.value;}}
            else if(exa.time==0) {;}
            else
            for(int i=0;i<4;i++)
            {
                if(x+d[i][1]<0||y+d[i][0]<0||x+d[i][1]>=n||y+d[i][0]>=m){continue;}//不越界
                else
                {
                    if(a[x+d[i][1]][y+d[i][0]]==1) //普通路径
                    {                    
                        q1.add(new node(x+d[i][1],y+d[i][0],exa.value+1,exa.time-1));
                        //c[x+d[i][1]][y+d[i][0]]=exa.value+1;
                        
                    }                    
                    else if(a[x+d[i][1]][y+d[i][0]]==4)//重置区
                    {                             
                         if(exa.time==1) {}
                         else
                         {
                             q1.add(new node(x+d[i][1],y+d[i][0],exa.value+1,6)); 
                             a[x+d[i][1]][y+d[i][0]]=0;
                         }
                    }
                    else if((a[x+d[i][1]][y+d[i][0]]==3))
                    {                        
                        q1.add(new node(x+d[i][1],y+d[i][0],exa.value+1,exa.time-1));
                        //c[x+d[i][1]][y+d[i][0]]=exa.value+1;
                    }
                    
                }
            }
        }                
    }
    public static Comparator<node> valuecompare =new Comparator<node>()
            {
                @Override
                public int compare(node arg0, node arg1) {                    
                    return (int)(arg0.value-arg1.value);
                }                
            };
}
class node
{
    int x;
    int y;
    int value;
    int time;
    public node(int x,int y,int z,int q)
    {
        this.x=x;
        this.y=y;
        this.value=z;
        this.time=q;
    }
}