package 母函数;

import java.util.Scanner;

public class hdu1284 {
	static long c1[];
	static long c2[];
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		c1=new long[32769];
		c2=new long[32769];
		sovle(32768);
		while(sc.hasNext())
		{
			int t=sc.nextInt();
			System.out.println(c1[t]);
		}
	}
	private static void sovle(int n) {
		// TODO 自动生成的方法存根
		for(int i=0;i<=n;i++)
		{
			c1[i]=1;
			c2[i]=0;
		}
		for(int i=2;i<=3;i++)
		{
			for(int j=0;j<=n;j++)
			{
				for(int k=0;k+j<=n;k+=i)
				{
					c2[k+j]+=c1[j];
				}
			}
			for(int j=0;j<=n;j++)
			{
				c1[j]=c2[j];c2[j]=0;
			}
		}
		
	}

}
