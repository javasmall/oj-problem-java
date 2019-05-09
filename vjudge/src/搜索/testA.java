package 搜索;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			if(n==-1&&k==-1)break;
			char m[][]=new char[n][n];
			boolean heng[]=new boolean[n];
			boolean shu[]=new boolean[n];
			for(int i=0;i<n;i++)
			{
				String string=sc.next();
				m[i]=string.toCharArray();
			}
//			List<node>list=new ArrayList<>();
//			for(int i=0;i<n;i++)
//			{
//				for(int j=0;j<n;j++)
//				{
//					if(m[i][j]=='#')
//					{
//						list.add(new node(i, j));
//					}
//				}
//			}
			dfs(heng,shu,0,0,k);
			
			
			
		}

	}
private static void dfs(boolean[] heng, boolean[] shu, int index, int num, int k) {
		// TODO 自动生成的方法存根
	
		
	}
static class node{
	int x;
	int y;
	public node(int x,int y)
	{
		this.x=x;this.y=y;
	}
}
}
