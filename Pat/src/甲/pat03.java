package 甲;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pat03 {
     static double r;
     static double p;
    static int s[];
    static int value[];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//total数量
		 p=sc.nextDouble();//供应商价格 也就是S（-1）
		 r=sc.nextDouble();
		s=new int[n];
		 value=new int[n];
		double value2[]=new double[n];
		Set<Integer> set=new HashSet();
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
			set.add(s[i]);
			
		}
		for(int i=0;i<n;i++)//预处理
		{
			if(value[i]==0)
			{
				value[i]=get(i);
			}			
		}	
		double max=0;int count=0;				
		
		Arrays.sort(value);
		for(int i=n-1;i>0;i--)
		{
			if(value[i]==value[n-1]) count++;
			if(value[i]<value[n-1])break;
		}
		max=p*Math.pow((100+r)/100, value[n-1]-1);
		
		System.out.println(String.format("%.2f", max)+" "+count);
	}

	private static int get(int i) {
		if(s[i]==-1) {return value[i]=1;}
		else
		{			
			if(value[s[i]]!=0) {return value[i]=value[s[i]]+1;}
			else {return value[i]=1+get(s[i]);}
		}	
	}
//	static class node
//	{
//		int parent;
//		int childnumber;//数量
//		 ArrayList<node> children;
//		public node() {
//			this.children=new ArrayList();
//		}
//		public node(int parent,int chidnumber)
//		{
//			this.parent=parent;
//			this.childnumber=chidnumber;
//		}
//		public void addchidd(node no)
//		{
//			this.childnumber++;
//			children.add(no);
//		}
//	}
}
