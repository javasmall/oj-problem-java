package 母函数;

import java.util.Scanner;

public class hdu1028 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int c1[]=new int[300];
		int c2[]=new int[300];
		for(int i=0;i<300;i++)
		{
			c1[i]=1;
		}
		for(int i=2;i<=120;i++)
		{
			for(int j=0;j<=120;j++)
			{
				for(int k=0;k+j<=120;k+=i)
				{
					c2[k+j]+=c1[j];
				}
			}
			for(int j=0;j<=120;j++)
			{
				c1[j]=c2[j];
				c2[j]=0;
			}
		}
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			System.out.println(c1[n]);
		}
	}
}
