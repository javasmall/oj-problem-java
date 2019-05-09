package test3;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		b+=30;int count=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]<=b) {count++;}
		}
		System.out.println(count);

	}

}
