package 迷宫生成;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class 迷宫 {
	static int x[]= {1,0,-1,0};//下。右 ,上，
	static int y[]= {0,1,0,-1};	
	static int time=0;//路径总长度
	static int time2=0;//计算总次数
	static int length;
	static boolean c=false;
	public static void main(String[] args)
	{
		System.out.println("请输入图的边长");
		Scanner sc=new Scanner(System.in);
		 length=sc.nextInt();
		draw(length);
	    
	}
	
	 private static void draw(int m) {
		 boolean b[][]=new boolean[m][m];	  //标记 
			char a[][]=new char[m][m];
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				a[i][j]='*';
			}
			dfs(a,b,0,0,m-1,m-1);//（00）走到（39.39的）上下左右随机
			c=false;b=new boolean[m][m];
			dfs2(a,b,m-1,0,0,m-1);//只会右上的简单随机走法（为了使图不单调）

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
				System.out.println();
			}		
	}
	static void dfs(char[][] a, boolean[][] b, int i, int j, int l, int m) {
		if(i==l&&j==m) {a[i][j]='6';
		System.out.println(time+"   "+time2);
		c=true;}//证明已经找到
		else if(!c)//终止递归
		{
			b[i][j]=true;
			List list=new ArrayList();
			List list2=new ArrayList();//存取排序后的数字
			for(int i1=0;i1<4;i1++){list.add(i1);}
			for(int i2=0;i2<4;i2++) 
			{
               int team=(int) (Math.random()*list.size());
              list2.add(list.get(team));
               list.remove(team);
			}
			for(int k=0;k<4;k++) {		
			int s=(int) list2.get(k);
			//System.out.println(s);
			if(i+x[s]>length-1||i+x[s]<0||j+y[s]>length-1||j+y[s]<0)//不满足题意的。
			{
				 continue;
			}
			else if(!b[i+x[s]][j+y[s]])//前面没有走过
			{
				char biaoji=a[i][j];
				time++;time2++;
			   a[i][j]='6';
			   dfs(a,b,i+x[s],j+y[s],l,m);			   
			   if(!c)//终止递归，防止破坏数组。
			   {a[i][j]=biaoji;
			   //b[i][j]=false;//不需要标记回溯，因为这条路走过就走过，换路走
			   time--;}			  
			   else//返回
			   {return;}			  
			}								
			}	
		}				
	}
	 static void dfs2(char[][] a, boolean[][] b, int i, int j, int l, int m) {
			if(i==l&&j==m) {a[i][j]='6';
			System.out.println(time+"   "+time2);
			c=true;}//证明已经找到
			else if(!c)//没找到结束
			{
				b[i][j]=true;
				List list=new ArrayList();
				List list2=new ArrayList();//存取排序后的数字
				for(int i1=0;i1<2;i1++){list.add(i1);}
				for(int i2=0;i2<2;i2++) 
				{
	               int team=(int) (Math.random()*list.size());
	              list2.add(list.get(team));
	               list.remove(team);
				}
				for(int k=0;k<2;k++) {		
				int s=(int) list2.get(k)+1;
				//System.out.println(s);
				if(i+x[s]>length-1||i+x[s]<0||j+y[s]>length-1||j+y[s]<0)//不满足题意的。
				{
					 continue;
				}
				else if(!b[i+x[s]][j+y[s]])//前面没有走过
				{
					char biaoji=a[i][j];
					time++;time2++;
				   a[i][j]='6';
				   dfs2(a,b,i+x[s],j+y[s],l,m);			   
				   if(!c)
				   {a[i][j]=biaoji;
				   //b[i][j]=false;//不需要标记回溯，因为这条路走过就走过，换路走
				   time--;}			  
				   else//返回
				   {return;}			  
				}								
				}	
			}					
		}
}
