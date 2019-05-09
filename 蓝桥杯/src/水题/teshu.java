package 水题;

import java.util.Scanner;

public class teshu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int q=0;q<10;q++)
				{
					if(i*100+j*10+q==i*i*i+j*j*j+q*q*q)
					{
						System.out.println(i*100+j*10+q);
					}
				}
			}
		}

	}

}
