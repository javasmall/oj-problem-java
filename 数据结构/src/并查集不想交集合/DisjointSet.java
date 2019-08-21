package 并查集不想交集合;

import java.util.Scanner;

public class DisjointSet {
	static int tree[]=new int[100000];//假设有500个值
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
			return tree[a]=search(tree[a]);//路径压缩
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
	public void union(int a,int b)//表示 a，b所在的树合并
	{
		int a1=search(a);//a根
		int b1=search(b);//b根
		if(a1==b1) {System.out.println(a+"和"+b+"已经在一棵树上");}
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
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int k=sc.nextInt();
		DisjointSet d=new DisjointSet();
		 for(int j=0;j<k;j++)
	        {
	        	int team=sc.nextInt();
	        	if(team==1)
	        	{
	        		int t=sc.nextInt();System.out.println(d.value(t));
	        	}
	        	else
	        	{
	        		int t=sc.nextInt();
	        		int t2=sc.nextInt();
	        		d.union(t, t2);
	        	}
	        }
	
	}

}
