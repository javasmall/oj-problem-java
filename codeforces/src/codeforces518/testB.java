package codeforces518;

import java.util.Scanner;

public class testB {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		if(n==1) {System.out.println(1);}
		else if(n==2) System.out.println(2);
		else 
		{
			int ans=2;int i=2;
			for(i=2;(long)(i*i)<n;i++)
			{
				
				if(n%i==0)
		        ans+=2;
				
			}
			if(i*i==n) {ans++;}
			System.out.println(ans);
			
		}
	}

}
