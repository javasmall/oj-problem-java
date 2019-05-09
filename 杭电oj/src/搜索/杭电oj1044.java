package 搜索;
import java.util.ArrayDeque;
    import java.util.Queue;
    import java.util.Scanner;
    
public class 杭电oj1044 {
        static int dx[]= {0,1,0,-1};
        static int dy[]= {1,0,-1,0};
        static int x1=0,y1=0,x2=0,y2=0,t=0,w=0,h=0,m=0;
        static int score=0;
        static int m1[];
        static int path=0;
        static char mi[][]=new char[50][50];
        public static void main(String[] args)  {
             Scanner sc=new Scanner(System.in);
             int T=sc.nextInt();//测试用例
            
             for(int T1=1;T1<T+1;T1++)
             { // if(T1!=T)
                 //System.out.println();
                 sc.nextLine();
                  w=sc.nextInt();//宽（左右
                  h=sc.nextInt();//高
                //  char mi[][]=new char[h][w];
                 t=sc.nextInt();//时间
                  m=sc.nextInt();//珠宝数量                  
                  m1=new int [m+1];//储存珠宝价值
                  int m2[][]=new int[m+1][2];//存宝物坐标
                 for(int i=0;i<m;i++)
                 {m1[i]=sc.nextInt();}//珠宝的价值
                 sc.nextLine();
                 for(int i=0;i<h;i++)//输入地图
                 {
                     String a=sc.nextLine();
                     mi[i]=a.toCharArray();
                 }
                 for(int i=0;i<h;i++)
                 {
                     for(int j=0;j<w;j++)
                     {
                        // System.out.print(mi[i][j]+" ");
                         if(mi[i][j]=='@') {x1=i;y1=j;mi[i][j]='.';}
                         if(mi[i][j]=='<') {x2=i;y2=j;mi[i][j]='.';}
                         if('A'<=mi[i][j]&&mi[i][j]<='A'+m) {m2[mi[i][j]-'A'][0]=i;m2[mi[i][j]-'A'][1]=j;}//粗存珠宝所在位置。
                     }                
                 }
                m2[m][0]=x2;m2[m][1]=y2;
                // for(int i=0;i<m+1;i++) { System.out.println( m2[i][0]+" "+m2[i][1]+" "+m1[i]); }
                // bfs(mi,1,1,3,5);System.out.print(m);
                int dp[][][]=new int [h][w][m+1];
                
                 if(bfs(x1,y1,x2,y2))//可以到达
                 {                    
                     score=0;
                     boolean jud[]=new boolean[m+1];                    
                     dfs2(x1,y1,0,0,jud,m2,dp);                 
                     System.out.println("Case "+T1+":");
                     if(T1==T) {System.out.println("The best score is "+score+".");}
                     else  {System.out.println("The best score is "+score+".");System.out.println();}
                     //System.out.print(path);
                 }
                 else
                 {                     
                      System.out.println("Case "+T1+":");
                      if(T1==T) {System.out.println("Impossible");}
                      else  { System.out.println("Impossible");System.out.println();}
                 }
             }        
        }
        private static void dfs2( int x, int y, int t2,int q, boolean[] jud, int[][] m2, int[][][] dp) {
            //System.out.println(q);
            if(x==x2&&y==y2) {if(t2<=t) {if(q>score) {score=q;}}}
            else if(t2+Math.abs(x-x2)+Math.abs(y-y2)>t) {}
            else
                for(int i=0;i<m+1;i++)
                {                                
                      if(!jud[i]&&dp[x][y][i]!=-1)
                    {    
                          if(dp[x][y][i]==0)//没有初始过
                         { 
                              if(bfs(x,y,m2[i][0],m2[i][1])) {
                                  jud[i]=true;dp[x][y][i]=path;//dp[x][y][i][1]=m1[i];
                                
                                    dfs2(m2[i][0],m2[i][1],t2+path,q+m1[i],jud,m2,dp);                    
                                    jud[i]=false;}
                              else {
                                  dp[x][y][i]=-1;//已经标记不能走
                              }                          
                         }
                          else //前面已经记录过，不需要重复bfs
                          {
                              jud[i]=true;
                            dfs2(m2[i][0],m2[i][1],t2+dp[x][y][i],q+m1[i],jud,m2,dp);                    
                                jud[i]=false;
                          }
                    }
                }
        }
        private static boolean bfs( int a1, int b1, int a2, int b2) {
            path=0;
            Queue<zuobiao> q1=new ArrayDeque();
            q1.add(new zuobiao(a1,b1,0));
            if(Math.abs(a1-a2)+Math.abs(b2-b1)>t) {return false;}
            if(Math.abs(a1-x2)+Math.abs(y2-b1)>t) {return false;}
            boolean b[][]=new boolean[h][w];
            b[a1][b1]=true;
            while(!q1.isEmpty())
            {
                zuobiao zuo=q1.poll();
                int x=zuo.x;int y=zuo.y;
                if(x==a2&&y==b2) {if(zuo.time<=t) {path=zuo.time;return true;}}
                else            
                for(int i=0;i<4;i++)
                {
                    if(x+dx[i]>=0&&x+dx[i]<h&&y+dy[i]>=0&&y+dy[i]<w)//不出届
                    {
                        if(mi[x+dx[i]][y+dy[i]]!='*'&&!b[x+dx[i]][y+dy[i]])//可以移动  时间
                        {
                            if(zuo.time+1+Math.abs(y+dy[i]-y2)+Math.abs(x+dx[i]-x2)<=t)
                            {q1.add(new zuobiao(x+dx[i],y+dy[i],zuo.time+1));
                            b[x+dx[i]][y+dy[i]]=true;}
                        }
                    }
                }                
            }
            return false;        
        }
        static class zuobiao
         {
             int x;
             int y;
             int time;
             int value;
             public zuobiao(int x,int y,int time)
             {
                 this.x=x;
                 this.y=y;
                 this.time=time;
             }
         }
    }