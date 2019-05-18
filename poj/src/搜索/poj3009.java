package ËÑË÷;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class poj3009{

	static int x[]= {0,1,0,-1};
	static int y[]= {1,0,-1,0};
	//static boolean isfinished=false;
	static int mintime;
	static int h,w;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
			 w=sc.nextInt();//y
			 h=sc.nextInt();//x
			if(w==0&&h==0)break;
			int map[][]=new int [h][w];
			boolean jud[][]=new boolean[h][w];
			int startx=0,endx=0,starty=0,endy=0;
			for(int i=0;i<h;i++)
			{
				for(int j=0;j<w;j++)
				{
					map[i][j]=sc.nextInt();
					if(map[i][j]==2)
					{
						startx=i;starty=j;
						map[i][j]=0;
					}
					if(map[i][j]==3)
					{
						endx=i;endy=j;
					}
				}
			}
			mintime=Integer.MAX_VALUE;
			dfs(startx,starty,map,endx,endy,0);
            System.out.println(mintime<11?mintime:-1);	
			}
		
		}
		

	private static void dfs(int xs, int ys, int[][] map, int endx, int endy,int time) {
		if(xs==endx&&ys==endy)
		{
			//System.out.println(time);
			if(time<mintime) {mintime=time;}
		}
		if(time>10) {}
		else {
			for(int j=0;j<4;j++)
			{
				int x1=xs;
				int y1=ys;
				if(xs+x[j]>=0&&xs+x[j]<h&&ys+y[j]>=0&&ys+y[j]<w)
				{
					if(map[xs+x[j]][ys+y[j]]==1)
					{
						continue;		
					}
				}
				//System.out.println(x1+" "+y1);
				while(x1+x[j]>=0&&x1+x[j]<h&&y1+y[j]>=0&&y1+y[j]<w)
				{
					if(map[x1+x[j]][y1+y[j]]==1)
					{
						map[x1+x[j]][y1+y[j]]=0;
						dfs(x1, y1, map, endx, endy, time+1);	
						map[x1+x[j]][y1+y[j]]=1;
						break;
					}
					else if (map[x1+x[j]][y1+y[j]]==3) {
						dfs(x1+x[j], y1+y[j], map, endx, endy, time+1);
						break;
					}
					else if(map[x1+x[j]][y1+y[j]]==0)
					{
						x1+=x[j];y1+=y[j];
					}
					
				}
					
				}
			
		}
	}

}