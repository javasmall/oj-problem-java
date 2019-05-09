package test3;

import java.util.Scanner;

public class testB {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int m=sc.nextInt();
		boolean a[]=new boolean[l+1];
		for(int i=0;i<m;i++)
		{
			int a1=sc.nextInt();
			int a2=sc.nextInt();
			for(int j=a1-1;j<a2;j++)
			{
				if(j>=0&&j<l+1)
				a[j]=true;
			}
		}
		int count=0;
		for(int i=0;i<l+1;i++)
		{
			if(!a[i])count++;
		}
		if(count==7)count--;
		System.out.println(count);
		

	}

}
