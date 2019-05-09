package 母函数;

import java.util.Scanner;

public class hdu2082 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q[]=new int[27];
		for(int s=0;s<n;s++)
		{
			int c1[]=new int[60];
			int c2[]=new int[60];
			for(int s1=1;s1<27;s1++)
			{
				q[s1]=sc.nextInt();
			}
			for(int i=0;i<=q[1];i++)
			{
				c1[i]=1;
			}
			for(int i=2;i<=26;i++)
			{
				for(int j=0;j<=50;j++)
				{
					for(int k=0;k+j<=50&&k<=i*q[i];k+=i)
					{
						c2[k+j]+=c1[j];
					}
				}
				for(int j=0;j<=50;j++)
				{
					c1[j]=c2[j];
					c2[j]=0;
				}
			}
			int sum=0;
			for(int i=1;i<=50;i++)
			{
				sum+=c1[i];
			}
			System.out.println(sum);
		}

	}

}
