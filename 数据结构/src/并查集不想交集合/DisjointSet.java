package ���鼯���뽻����;

import java.util.Scanner;

public class DisjointSet {
	static int tree[]=new int[100000];//������500��ֵ
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
			return tree[a]=search(tree[a]);//·��ѹ��
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
	public void union(int a,int b)//��ʾ a��b���ڵ����ϲ�
	{
		int a1=search(a);//a��
		int b1=search(b);//b��
		if(a1==b1) {System.out.println(a+"��"+b+"�Ѿ���һ������");}
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
	}
	public static void main(String[] args)
	{
		
		
		DisjointSet d=new DisjointSet();
		d.union(1,2);
		d.union(3,4);
		d.union(5,6);
		d.union(1,6);
		
		d.union(22,24);
		d.union(3,26);
		d.union(36,24);
		System.out.println(d.search(6));	//ͷ
		System.out.println(d.value(6));     //��С
		System.out.println(d.search(22));	//ͷ
		System.out.println(d.value(22));     //��С
	}
}
