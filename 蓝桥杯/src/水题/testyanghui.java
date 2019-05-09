package 水题;

import java.util.Scanner;

public class testyanghui {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n+1][n+1];
		
		for(int i=1;i<n+1;i++)
		{
			a[i][0]=1;a[i][i-1]=1;
		}
		for(int i=2;i<n+1;i++)
		{
			for(int j=1;j<i;j++)
			{
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
		for(int i=1;i<n+1;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				if(j==i-1)System.out.print(a[i][j]);
				else
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
