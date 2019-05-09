package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1130c {

	static int x[]= {0,1,0,-1};
	static int y[]= {1,0,-1,0};
	static boolean jud[][];
	static int map[][];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ax=sc.nextInt();int ay=sc.nextInt();
		int bx=sc.nextInt();int by=sc.nextInt();
		 map=new int[n][n];
		jud=new boolean[n][n];
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			for(int j=0;j<n;j++)
			{
				map[i][j]=Integer.parseInt(str.charAt(j)+"");
			}
		}
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				System.out.println(map[i][j]+" ");
//			}
//			System.out.println();
//		}
		List<node>list=new ArrayList<>();list.add(new node(ax-1, ay-1));
		List<node>list2=new ArrayList<>();list2.add(new node(bx-1, by-1));
		search(ax-1,ay-1,list,n);
		search(bx-1,by-1,list2,n);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++)
		{
			node no=list.get(i);
			for(int j=0;j<list2.size();j++)
			{
				node no2=list2.get(j);
				int len=(no.x-no2.x)*(no.x-no2.x)+(no.y-no2.y)*(no.y-no2.y);
				System.out.println(no.x+" "+no.y+" "+no2.x+" "+no2.y);
				if(len<min) {min=len;}
			}
		}
		System.out.println(min);
	}
	private static void search(int ax, int ay, List<node> list,int n) {
		// TODO 自动生成的方法存根
		
		for(int i=0;i<4;i++)
		{
			if(ax+x[i]>=0&&ax+x[i]<n&&ay+y[i]>=0&&ay+y[i]<n)
			{
				if(!jud[ax+x[i]][ay+y[i]]&&map[ax+x[i]][ay+y[i]]==0)
				{
					list.add(new node(ax+x[i], ay+y[i]));
					jud[ax+x[i]][ay+y[i]]=true;
					search(ax+x[i], ay+y[i], list, n);
				}
			}
		}
		
	}
	static class node
	{
		int x;
		int y;
		public node(int x,int y)
		{
            this.x=x;
            this.y=y;
		}
	}

}
