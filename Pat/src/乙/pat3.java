package ““;

import java.util.Scanner;

public class pat3 {	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int m=sc.nextInt();
			int n=sc.nextInt();
			int a[]=new int[n];
			int m1=0,m2=0;
			while(m1<n)
			{
				m2++;
				if(judgle(m2)) {a[m1++]=m2;}
			}
			
			for(int i=m-1;i<n;i++)
			{
				if((i+2-m)%10==0)
				{System.out.print(a[i]);
					System.out.println();
					}
				else if(i==n-1) System.out.print(a[i]);
			    else
				System.out.print(a[i]+" ");
				
			}
		}
		static boolean judgle(int a)
		{
			if(a==1)return false;
			else
			for(int i=2;i*i<=a;i++)
			{
				if(a%i==0) {return false;}
			}
			return true;		
		}
	}