package 历年测试;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//五位数
		int count=0;
		for(int i=1;i<10;i++)//两边
		{
			for(int j=0;j<10;j++)//旁边
			{
				for(int k=0;k<10;k++)
				{
					if(i*2+j*2+k==n)
					{
					    System.out.println(i*10000+i+j*1000+j*10+k*100);count++;
					}
				}
			}
		}
		for(int i=1;i<10;i++)//两边
		{
			for(int j=0;j<10;j++)//旁边
			{
				for(int k=0;k<10;k++)
				{
					if(i*2+j*2+k*2==n)
					{
					    System.out.println(i*100000+i+j*10000+j*10+k*100+k*1000);count++;
					}
				}
			}
		}
		if(count==0) {System.out.println(-1);}
		

	}

}
