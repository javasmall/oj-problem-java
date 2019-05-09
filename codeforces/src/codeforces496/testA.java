package codeforces496;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//×ÜÊıÁ¿
		int a[]=new int[n];
		int number=-1;
		int value[]=new int[1000];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==1) {number++;}
			value[number]=a[i];
		}
		System.out.println(number+1);
		for(int i=0;i<number+1;i++)
		{
			if(i!=number)
			System.out.print(value[i]+" ");
			else
				System.out.print(value[i]);
		}	
	}
}
