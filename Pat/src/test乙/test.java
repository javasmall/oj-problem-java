package test乙;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<node>list=new ArrayList<>();
		int a2=0;
		for(int i=0;i<n;i++)
		{
			long x1=sc.nextLong();
			long x2=sc.nextLong();
			list.add(new node(x1, x2));a2+=x2;
		}
		int time=0;
		list.sort(comparator);long value=0;
		for(int i=0;i<list.size();i++)
		{
			node no=list.get(i);
			a2-=no.b;
			value+=a2*no.a;
			
		}
		System.out.println(value);
		

	}
	static class node
	{
		long a;
		long b;
		public node(long a,long b)
		{
			this.a=a;
			this.b=b;
		}
	}
	static Comparator<node>comparator=new Comparator<node>() {

		@Override
		public int compare(node o1, node o2) {
			// TODO 自动生成的方法存根
			double a1=(double)o1.b/(double)o1.a;
			double a2=(double)o2.b/(double)o2.a;
			return a2-a1>0?1:-1;
			
		}
	};

}
