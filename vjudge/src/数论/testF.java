package 数论;

import java.util.Scanner;

public class testF {
    static int max=10000001;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int prime[]=new int[max];
		boolean isprime[]=new boolean[max];
		//prime[0]=1;
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
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=sc.nextInt();
			int count=0;
			for(int j=0;prime[j]<=x/2;j++)
			{
				if(!isprime[x-prime[j]])
				{
					count++;
				}
			}
			System.out.println("Case "+(i+1)+": "+count);
			
		}

	}

}
