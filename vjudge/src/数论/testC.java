package 数论;


import java.util.Scanner;

public class testC {
  static int index=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long prime[]=new long[100001];
		boolean isprime[]=new boolean[10000001];
		for(int i=2;i<1000001;i++)
		{
			if(!isprime[i])
			{
				prime[index++]=i;
				for(int j=i+i;j<1000000;j=j+i)
				{
					isprime[j]=true;					
				}
			}
		}
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
				long a=sc.nextLong();
				long b=sc.nextLong();
				long number=1;
				long c=a;
				if(b>=Math.ceil(a)) {number=0;}
				else {
				for(int j=0;j<index;j++)
				{
					if(c==0||prime[j]>c) {break;}
					long team=0;
				    while(c%prime[j]==0)
				    {
				    	c/=prime[j];team++;
				    }
				    number=number*(1+team);
				}	
				if(c>1)number*=2;
				number/=2;
				for(int j=1;j<b;j++)
				{
					if(a%j==0)number--;
				}
				}
				System.out.println("Case "+(i+1)+": "+number);
		}
	}

}
