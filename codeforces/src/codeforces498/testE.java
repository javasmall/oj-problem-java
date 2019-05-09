package codeforces498;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class testE {
	static boolean bool=false;
    static int value,number=1;
    static int a[];//打表的值，通过位置反应值
    static int b[];//
  //  static Map<Integer,Integer>map;//通过值反应对应位置
    static int end[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
	//	map=new HashMap();
		 a=new int[n+1];
		 b=new int[n+1];
		 end=new int[n+1];
		tree t[]=new tree[n+1];
		for(int i=0;i<n+1;i++)
		{
			t[i]=new tree(i);
		}
		
		for(int i=1;i<n;i++)
		{
			int team=sc.nextInt();
			t[team].list.add(i+1);
			
		}
		dfs(1,t);
		for(int i=0;i<q;i++)
		{
			bool=false;
			int first1=sc.nextInt();
			value=sc.nextInt();//数量
			int fi=b[first1];//位置编号			
			if(fi+value-1>end[first1]) {System.out.println(-1);}
			else  {System.out.println(a[fi+value-1]);}
			
		}

	}
	private static void dfs(int first, tree[] t) {
		   a[number]=first;
			//map.put(first, number++);
			b[first]=number++;
			for(int i=0;i<t[first].list.size();i++)
			{
				
				dfs(t[first].list.get(i),t);
			}
			end[first]=number-1;
	}
	static class tree
	{
		int index;
		
		List<Integer> list=new ArrayList();
		public tree() {}
		public tree(int index)
		{
			this.index=index;
		}
		public tree(int index,ArrayList list)
		{
			this.index=index;
			this.list=list;
		}
	}
}
