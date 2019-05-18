package 搜索;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class poj3669 {
	static int X[]= {0,1,0,-1};
	static int Y[]= {1,0,-1,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 int map[][]=new int[310][310];
		 for(int i=0;i<310;i++)
		 {
			 for(int j=0;j<310;j++)
			 {
				 map[i][j]=Integer.MAX_VALUE;
			 }
		 }
		 boolean isdestory[][]=new boolean[310][310];
		 boolean havawalked[][]=new boolean[310][310];
		 for(int i=0;i<t;i++)
		 {
			 int x=sc.nextInt();
			 int y=sc.nextInt();
			 int second=sc.nextInt();
			 if(map[x][y]>second)
			 map[x][y]=second;
			 isdestory[x][y]=true;
			 for(int j=0;j<4;j++)//记录最早被糟蹋的时刻
			 {
				 if(x+X[j]>=0&&x+X[j]<302&&y+Y[j]>=0&&y+Y[j]<302)
				 {
					 if(map[x+X[j]][y+Y[j]]>second)
					 {
						 map[x+X[j]][y+Y[j]]=second;
						 isdestory[x+X[j]][y+Y[j]]=true;
					 }
				 }
			 }
		 }
//		 for(int i=0;i<6;i++)
//		 {
//			 for(int j=0;j<6;j++)
//			 {
//				 System.out.print(map[i][j]+""+isdestory[i][j]+" " );
//			 }
//			 System.out.println();
//		 }
		 Queue<node>q1=new ArrayDeque<node>();
		 q1.add(new node(0, 0,0));
		 havawalked[0][0]=true;
		 boolean jud=true;
		 while (!q1.isEmpty()) {
			node te=q1.poll();
			int x=te.x;
			int y=te.y;
			if(!isdestory[x][y]&&!(x==0&&y==0))
			{
//				for(int j=0;j<4;j++)//记录最早被糟蹋的时刻
//				 {
//					 if(x+X[j]>=0&&x+X[j]<301&&y+Y[j]>=0&&y+Y[j]<301)
//					 {
//						 if(isdestory[x+X[j]][y+Y[j]])//被糟蹋
//						 {
//							 jud=false;//System.out.println((x+X[j])+" "+(y+Y[j]) );
//						 }
//					 }
//				 }
//				if(jud)
//				{
				System.out.println(te.second);return;
//				}
//				else {
//					 for(int j=0;j<4;j++)//记录最早被糟蹋的时刻
//					 {
//						 if(x+X[j]>=0&&x+X[j]<310&&y+Y[j]>=0&&y+Y[j]<310)
//						 {
//							 if(map[x+X[j]][y+Y[j]]>(te.second+1)&&!havawalked[x+X[j]][y+Y[j]])
//							 {
//								
//								 havawalked[x+X[j]][y+Y[j]]=true;
//								 q1.add(new node(x+X[j], y+Y[j], te.second+1));
//							 }
//						 }
//					 }
//				}
			}
			else {
				 for(int j=0;j<4;j++)//记录最早被糟蹋的时刻
				 {
					 if(x+X[j]>=0&&x+X[j]<310&&y+Y[j]>=0&&y+Y[j]<310)
					 {
						 if(map[x+X[j]][y+Y[j]]>(te.second+1)&&!havawalked[x+X[j]][y+Y[j]])
						 {
							
							 havawalked[x+X[j]][y+Y[j]]=true;
							 q1.add(new node(x+X[j], y+Y[j], te.second+1));
						 }
					 }
				 }
			}
			
		}
		 System.out.println(-1);
	}
	static class node
	{
		int x;
		int y;
		int second;
		public node(int x,int y,int second) {
			// TODO Auto-generated constructor stub
		   this.x=x;
		   this.y=y;
		   this.second=second;
		}
	}

}