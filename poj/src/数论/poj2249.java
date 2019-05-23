package ÊýÂÛ;

import java.util.Scanner;

public class poj2249 {

	static long x=0,y=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			long gcd=sc.nextLong();
			long lcm=sc.nextLong();
			extgcd(gcd, lcm);
		}
		
	}
	static long extgcd(long a,long b)
	{
		if(b==0) {x=1;y=0;return a;}
		long ans=extgcd(b, a%b);
		long team=x;
		x=y;
		y=team-a/b*y;
		return ans;
	}

}
