package 水题;

import java.util.Scanner;

public class testhuiwen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int q=0;q<10;q++)
				{
				if(i*2+j*2+q==n)
				System.out.println(i*10000+j*1000+q*100+j*10+i);
				}
			}
		}
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int q=0;q<10;q++)
				{
				   if(i*2+j*2+q*2==n)
				   System.out.println(i*100000+j*10000+q*1000+q*100+j*10+i);
				}
			}
		}

	}

}
