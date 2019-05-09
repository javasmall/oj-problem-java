package 数论;

import java.util.Scanner;

public class testv {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int  t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=sc.nextLine();
			String s1[]=s.split(" ");
			int a[]= new int[s1.length];
			for(int j=0;j<a.length;j++)
			{
				a[j]=Integer.parseInt(s1[j]);
			}
			int max=0;
			for(int j=0;j<a.length;j++)
			{
				for(int q=j+1;q<a.length;q++)
				{
					int value=gcd(a[j],a[q]);
					if(value>max)max=value;
				}
			}
			System.out.println(max);
		}

	}

	private static int gcd(int i, int j) {
		if(j==0)return i;
		else {
			return gcd(j, i%j);
		}
	}

}
