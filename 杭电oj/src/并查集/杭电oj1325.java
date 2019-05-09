package 并查集;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 杭电oj1325 {
 
	static int tree[]=new int[10005];
	
	static int end=0;//标记最后的结果
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int exa=0;
		boolean bool=true;
		int t=1;
		for(int q=0;q<10005;q++) {tree[q]=-1;}
		while(sc.hasNext())
		{			
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a<0&&b<0)break;
			
			if(b!=0) {exa=b;}
			if(a==0&&b==0) 

			{
				if(bool&&(end==value(exa)-1)||exa==0) System.out.println("Case "+t+++" is a tree.");
			    else 
			    	 System.out.println("Case "+t+++" is not a tree."
			    	 		+ "");
				exa=0;end=0;bool=true;
				tree=new int[10005];
				for(int i=0;i<10005;i++)
				{tree[i]=-1;}
			}
			else 
				if(bool)
				{bool=union(a,b);}
		}
	}
	public static boolean union(int a,int b)//表示 a，b所在的树合并
	{
		int a1=search(a);//a根
		int b1=search(b);//b根
		int a2=value(a);int b2=value(b);
		if(a1==b1||b!=b1) {return false;}
		else {
		
			end++;
			tree[a1]+=tree[b1];//个数相加  注意是负数相加
			tree[b1]=a1;       //b树成为a的子树，直接指向a；
		
		}
		return true;
	}	
	public static int search(int a)//返回头节点的数值
	{
		if(tree[a]>0)//说明是子节点
		{
			return search(tree[a]);
		}
		else
			return a;
	}
	public static int value(int a)//返回a所在树的大小（个数）
	{
		if(tree[a]>0)
		{
			return value(tree[a]);
		}
		else
			return -tree[a];
	}
	
}
