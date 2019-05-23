package ÊıÂÛ;

import java.util.Scanner;

public class hdu2138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int t=sc.nextInt();
			int a[]=new int [t];
			int num=0;
			for(int i=0;i<t;i++)
			{
				a[i]=sc.nextInt();
				if(isprime(a[i])) {num++;}
			}
			System.out.println(num);
		}

	}

	private static boolean isprime(int val) {
		if(val<=3)return true;
		for(int i=2;i*i<val+1;i++)
		{
			if(val%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
