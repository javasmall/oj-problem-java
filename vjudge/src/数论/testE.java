package 数论;

import java.math.BigInteger;
import java.util.Scanner;

public class testE {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			int qian=getqian(a, b);
			long wei=getwei(a, b);
			String wei2=wei+"";
			while(wei2.length()!=3)
			{
				wei2="0"+wei2;
			}
			System.out.println("Case "+(i+1)+": "+qian+" "+wei2);
		}
	}
	private static int getqian(long a, long b) {
		double value=Math.pow(10, b*Math.log10(a)-(int)(b*Math.log10(a)));
		value*=100;
		return (int)value;
	}
	private static long getwei(long a, long b) {
		if(b==0)return 1;
		else if(b==1) {return a%1000;}
		else if(b%2==0)return getwei((a*a)%1000, b/2)%1000;
		else return a*getwei((a*a)%1000, b/2)%1000;
	}
}
