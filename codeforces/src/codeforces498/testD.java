package codeforces498;

import java.util.Scanner;

public class testD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a=sc.next();
		String b=sc.next();
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		boolean bool[]=new boolean[a.length()];
		for(int i=0;i<n;i++)//标记相同的不动。
		{
			if(a1[i]==b1[i]) {bool[i]=true;}
		}
		int time=0;
		for(int i=0;i<n;i++)
		{
			if(!bool[i])
			{
				if(!bool[n-i-1])
				{
					 if(b1[i]==b1[n-i-1])
						{
							char t=a1[i];
							a1[i]=b1[i];
							b1[i]=t;
							//time++;
							
						}
					if(a1[i]==b1[n-i-1])
					{
						char t=a1[i];
						a1[i]=a1[n-1-i];
						a1[n-1-i]=t;
						bool[n-1-i]=true;
					}
					 if(b1[i]==a1[n-1-i])
					{
						char t=a1[i];
						a1[i]=a1[n-1-i];
						a1[n-1-i]=t;
						bool[i]=true;
					}					
				}
			}
		}	
		for(int i=0;i<n;i++)
		{
			if(!bool[i]&&a1[i]!=b1[i])
					{time++;}
		}
		System.out.println(time);
	}
}
