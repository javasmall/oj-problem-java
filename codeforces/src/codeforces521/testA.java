package codeforces521;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			long value=0;
			if(c%2==1)value+=a;
			value+=(long)(c/2)*(a-b);
			System.out.println(value);
		}

	}

}
