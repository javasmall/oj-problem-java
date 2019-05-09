package 算法训练;

import java.util.Scanner;

public class test02 {
    static long count=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		
		for(long i=n;i>3;i--)
		{
			jude(i);
		}
		
		System.out.println(count);

	}
private static void jude(long n) {
		// TODO 自动生成的方法存根
	long value=n;int index=0;
	for(long j=n-1;j>0;j--)
	{
		if(gcd(j, value)==1) {value=j*value;index++;}
		if(index==2)break;
	}
	if(value>count) {count=value;}
	}
static	long gcd(Long x,Long y)
	{
		if(y==0)return x;
		else return gcd(y, x%y);
	}

}
