package 搜索;

import java.util.Scanner;

public class 杭电1181并查集 {

	static int a[];//储藏父节点
	public static void main(String[] args) {
		// TODO 自动生成的方法存根		
		Scanner sc=new Scanner(System.in);
		init();
		while(sc.hasNext())
		{
			String str=sc.next();
			if(str.equals("0")) {
				
				int index=a[12];
				if(a[12]==-1) {System.out.println("No.");}//m这个点没有父亲
				else
				{
					int value=search(12);
					if(value==1) {System.out.println("Yes.");}
					else System.out.println("No.");
				}
				init();
			}
			else
			{
				int start=str.charAt(0)-'a';
				int  end=str.charAt(str.length()-1)-'a';
				join(start, end);
			}
		}
	}
	static void init() {
		a=new int[26];
		for(int i=0;i<26;i++)
		{
			a[i]=-1;
		}
	}
	static int search(int i)//查找父节点编号 
	{
		if(a[i]==-1)return i;
		else return  search(a[i]);
	}
	static void join(int b1,int b2)//b1<-b2   b1为父亲
	{
		int a1=search(b1);//b1父节点
		int a2=search(b2);//b2 父节点
		if(a1==a2) {}//已经在一棵树上 
		else if(a1==12) {}//m点不做任何点的父节点，他是最底层的根节点
		else {
			a[a2]=a1;
		}
	}
}
