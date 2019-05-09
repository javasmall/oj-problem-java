package 并查集;

import java.util.Scanner;
public class 杭电oj1722union {
	public static void main(String[] args)
	{
		DisjointSet j=new DisjointSet();
		Scanner sc=new Scanner(System.in);
		//boolean visit[]=new boolean[100000];
		boolean bool=true;
		int number=0;
		int last=0;
		while(sc.hasNext())
		{
			int a=sc.nextInt();
			int b=sc.nextInt();				
			if(a==-1&&b==-1) {break;}
			else if(a==0&&b==0)//输出
		    {				
			    if(number==0||bool&&j.value(last)==number)
		    	{
		    		System.out.println("Yes");
		    	}
		    	else
		    	{
		    		System.out.println("No");
		    	}
		    	j=new DisjointSet(); number=0;
				 last=0;bool=true;	
				 sc.nextLine();
		    }
		    else
		    if(bool) {
		    	if(j.value(a)==1) {number++;}
		    	if(j.value(b)==1) {number++;}
		    	bool=j.union(a, b);last=b;}
		}
	}	
}
class DisjointSet {
	static int tree[]=new int[100001];//假设有500个值
	public DisjointSet() 	{set(this.tree);}
	public DisjointSet(int tree[]) 
	{
		this.tree=tree;
		set(this.tree);
	}
	public void set(int a[])//初始化所有都是-1 有两个好处，这样他们指向-1说明是自己，第二，-1代表当前森林有-（-1）个
	{
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			a[i]=-1;
		}
	}
	public int search(int a)//返回头节点的数值
	{
		if(tree[a]>0)//说明是子节点
		{
			return search(tree[a]);
		}
		else
			return a;
	}
	public int value(int a)//返回a所在树的大小（个数）
	{
		if(tree[a]>0)
		{
			return value(tree[a]);
		}
		else
			return -tree[a];
	}
	public boolean union(int a,int b)//表示 a，b所在的树合并
	{
		int a1=search(a);//a根
		int b1=search(b);//b根
		int a2=value(a);int b2=value(b);
		if(a1==b1) {return false;}
		else {
		if(tree[a1]<tree[b1])//这个是负数，为了简单减少计算，不在调用value函数
		{
			tree[a1]+=tree[b1];//个数相加  注意是负数相加
			tree[b1]=a1;       //b树成为a的子树，直接指向a；
		}
		else
		{
			tree[b1]+=tree[a1];//个数相加  注意是负数相加
			tree[a1]=b1;       //b树成为a的子树，直接指向a；
		}
		}
		return true;
	}	
}


