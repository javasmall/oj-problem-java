package codeforces;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			for(int j=i;j<=x;j++)
			{
				if(j/i<x&&i*j>x)
				{
					if(j%i==0)
					{
						System.out.println(j+" "+i);
						return;
					}
				}
			}
		}
		System.out.println(-1);

	}

}
