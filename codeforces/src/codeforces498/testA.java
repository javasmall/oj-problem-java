package codeforces498;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)a[i]--;
		}
		for(int i=0;i<n;i++)
		{
			if(i==n-1)System.out.println(a[i]);
			else System.out.print(a[i]+" ");
		}

	}

}
