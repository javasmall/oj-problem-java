package ��;


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
		// TODO �Զ����ɵķ������

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//total����
		 p=sc.nextDouble();//��Ӧ�̼۸� Ҳ����S��-1��
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
		for(int i=0;i<n;i++)//Ԥ����
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
//		int childnumber;//����
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
