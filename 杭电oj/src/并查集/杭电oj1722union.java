package ���鼯;

import java.util.Scanner;
public class ����oj1722union {
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
			else if(a==0&&b==0)//���
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
	static int tree[]=new int[100001];//������500��ֵ
	public DisjointSet() 	{set(this.tree);}
	public DisjointSet(int tree[]) 
	{
		this.tree=tree;
		set(this.tree);
	}
	public void set(int a[])//��ʼ�����ж���-1 �������ô�����������ָ��-1˵�����Լ����ڶ���-1����ǰɭ����-��-1����
	{
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			a[i]=-1;
		}
	}
	public int search(int a)//����ͷ�ڵ����ֵ
	{
		if(tree[a]>0)//˵�����ӽڵ�
		{
			return search(tree[a]);
		}
		else
			return a;
	}
	public int value(int a)//����a�������Ĵ�С��������
	{
		if(tree[a]>0)
		{
			return value(tree[a]);
		}
		else
			return -tree[a];
	}
	public boolean union(int a,int b)//��ʾ a��b���ڵ����ϲ�
	{
		int a1=search(a);//a��
		int b1=search(b);//b��
		int a2=value(a);int b2=value(b);
		if(a1==b1) {return false;}
		else {
		if(tree[a1]<tree[b1])//����Ǹ�����Ϊ�˼򵥼��ټ��㣬���ڵ���value����
		{
			tree[a1]+=tree[b1];//�������  ע���Ǹ������
			tree[b1]=a1;       //b����Ϊa��������ֱ��ָ��a��
		}
		else
		{
			tree[b1]+=tree[a1];//�������  ע���Ǹ������
			tree[a1]=b1;       //b����Ϊa��������ֱ��ָ��a��
		}
		}
		return true;
	}	
}


