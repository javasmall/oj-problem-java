package ´óÊý;

import java.math.BigInteger;
import java.util.Scanner;

public class º¼µç1715 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger big[]=new BigInteger[1001];
		big[1]=big[2]=BigInteger.ONE;
		for(int i=3;i<1001;i++)
		{
			big[i]=big[i-1].add(big[i-2]);
		}
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			System.out.println(big[x]);
		}
	}

}
