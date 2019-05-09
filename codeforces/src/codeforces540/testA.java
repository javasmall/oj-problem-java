package codeforces540;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		
		for(int s=0;s<q;s++)
		{
			long n=sc.nextLong();//
			long a=sc.nextLong();//1L的价钱
			long b=sc.nextLong();//2L的价钱
			if(a*2<=b)System.out.println(n*a);
			
			else
			{
				if(n%2==0)System.out.println(n*b/2);
				else {
					long t2=(n/2)*b+a;
					System.out.println(t2);
				}
			}
		}

	}

}
