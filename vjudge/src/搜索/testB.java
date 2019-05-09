package 搜索;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 *  0 1 1 0
 *  0 0 0 0
 *  0 0 0 0
 *  0 1 1 0
 */
public class testB {

	static int xstart=0;static int ystart=0;static int hstart=0;
	static int xend=0;static int yend=0;static int hend=0;
	static int x1[]= {0,1,0,0,-1,0};//上下左右 前后
	static int y1[]= {1,0,0,-1,0,0};
	static int z1[]= {0,0,1,0,0,-1};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int l=sc.nextInt();//lever层数  h
			int r=sc.nextInt();//行  x
			int c=sc.nextInt();//列  y
			if(l==0&&r==0&&c==0)break;
			char map[][][]=new char[l][r][c];
			for(int i=0;i<l;i++)
			{
				for(int j=0;j<r;j++)
				{
					map[i][j]=sc.next().toCharArray();
				}
//				sc.next();
			}
			
			for(int i=0;i<l;i++)
			{
				for(int j=0;j<r;j++)
				{
				  for(int k=0;k<c;k++)
				  {
					  if(map[i][j][k]=='S')
					  {
						  xstart=j;ystart=k;hstart=i;
					  }
				  }
				 // System.out.println();
				}
				//System.out.println("    ");
			}
			boolean jud[][][]=new boolean[l][r][c];
			Queue<node>q1=new ArrayDeque<node>();
			q1.add(new node(xstart, ystart, hstart,0));
			boolean b=false;int x,y,z=0;
			jud[hstart][xstart][ystart]=true;
			while(!q1.isEmpty())
			{
				node point=q1.poll();
				 x=point.x;y=point.y; z=point.h;
				for(int i=0;i<6;i++)
				{
					if(x+x1[i]<r&&x+x1[i]>=0&&y+y1[i]>=0&&y+y1[i]<c&&z+z1[i]>=0&&z+z1[i]<l)//没有越界
					{
						if(map[z+z1[i]][x+x1[i]][y+y1[i]]=='.'&&!jud[z+z1[i]][x+x1[i]][y+y1[i]])
						{
							q1.add(new node(x+x1[i], y+y1[i], z+z1[i], point.minitu+1));
							jud[z+z1[i]][x+x1[i]][y+y1[i]]=true;
						}
						else if(map[z+z1[i]][x+x1[i]][y+y1[i]]=='E')
						{
							
							System.out.println("Escaped in "+(point.minitu+1)+" minute(s).");
							b=true;
							break;
						}
					}
				}
				if(b)break;
			}
			if(!b)
			{
				System.out.println("Trapped!");
			}
			
			
		}

	}	
	static Comparator<node>com=new Comparator<node>() {
		public int compare(node o1, node o2) {
			// TODO 自动生成的方法存根
			return (int)(o1.minitu-o2.minitu);
		}
	};

}
class node
	{
		int x;int y;int h;
		int minitu;
		public node(int x,int y,int h, int minitu)
		{
			this.x=x;this.y=y;this.h=h;this.minitu=minitu;
		}
	}

