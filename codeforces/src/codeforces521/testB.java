package codeforces521;

import java.util.Scanner;

public class testB {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=1;i<n-1;i++)
		{
			if(a[i]==0&&a[i-1]==1&&a[i+1]==1)
			{
				a[i+1]=0;
				count++;
			}
		}
		System.out.println(count);
	}
}
