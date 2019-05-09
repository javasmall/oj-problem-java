package 数论;

import java.util.Scanner;

public class testH {
	static int max=10000001;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int prime[]=new int[max];
		boolean isprime[]=new boolean[max];
		int index=0;
		for(int i=2;i<max;i++)
		{
			if(!isprime[i])
			{
				prime[index++]=i;
				for(int j=i+i;j<max;j+=i)
				{
					isprime[j]=true;;
				}
			}
		}
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=sc.nextLong();
			long c=n;
			int value=0;long num=1;int type=0;
			for(int j=0;j<index;j++)
			{
				if(c==0||prime[j]>c) {break;}
				long team=0;
			    while(c%prime[j]==0)
			    {
			    	c/=prime[j];team++;
			    }
			    if(team>0) {num*=team*2+1;}
			    
			}	
			if(c>1) {num*=3;}//再最大的数之上但是无法分解是素数
			num/=2;//除了（n,n）所有都出现了两次
			System.out.println("Case "+(i+1)+": "+(num+1));
		}
	}
}
