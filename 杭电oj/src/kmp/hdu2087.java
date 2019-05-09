package kmp;

import java.util.Scanner;

public class hdu2087 {
	static int [] getnext(String s)
	{
		char a[]=s.toCharArray();
		int next[]=new int[s.length()];
		next[0]=-1;
		int k=-1;int i=0;
		while(i<a.length-1)
		{
			if(k==-1||a[k]==a[i])
			{
				k++;i++;
				next[i]=k;
			}
			else
			{
				k=next[k];
			}
		}
		return next;
	}
	static int kmp(String a,String b)
	{
		int count=0;
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		int next[]=getnext(b);
		int i=0;
		int j=0;
		while(i<a.length())
		{
			if(j==-1||a1[i]==b1[j])
			{
				i++;j++;
			}
			else
			{
				j=next[j];
			}
			if(j==b1.length) {count++;j=0;}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext())
		{
			String a=sc.next();
			if(a.equals("#")) {break;}
			String b=sc.next();
			int value=kmp(a, b);
			System.out.println(value);
			
		}

	}

}
