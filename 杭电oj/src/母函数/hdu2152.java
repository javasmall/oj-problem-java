package 母函数;

import java.util.Scanner;

public class hdu2152 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext())
		{
			int n=sc.nextInt();//水果种数
			int m=sc.nextInt();//个数
			int fruit[][]=new int[n+2][2];
			for(int i=1;i<=n;i++)
			{
				fruit[i][0]=sc.nextInt();fruit[i][1]=sc.nextInt();
			}
			int c1[]=new int[m+100];
			int c2[]=new int[m+100];
			for(int i=fruit[1][0];i<=fruit[1][1];i++)
			{
				c1[i]=1;  
			}
			for(int i=2;i<=n;i++)
			{
			    for(int j=0;j<=m;j++)
			    {
			    	for(int k=fruit[i][0];k+j<=m&&k<=fruit[i][1];k++)
			    	{ 
			    		c2[j+k]+=c1[j];
			    	}
			    }
			    for(int j=0;j<=m;j++)
			    {
			    	c1[j]=c2[j];c2[j]=0;
			    }
			}
			System.out.println(c1[m]);
		}

	}
}
