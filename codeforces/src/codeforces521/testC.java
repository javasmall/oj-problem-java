package codeforces521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class testC {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=a.clone();
		Arrays.sort(b);
		long c[]=new  long[n];
		long num1=-Integer.MAX_VALUE;long num2=-Integer.MAX_VALUE;
		List<Integer>list=new ArrayList<>();
		c[0]=b[0];
		for(int i=1;i<n;i++)
		{
			c[i]=c[i-1]+(long)b[i];
		}
//		if(c[n-2]==b[n-1])//满足条件
//		{
//			System.out.println(0);
//		}
//		else
		{
			//先判断去掉最大情况
			if(n>=3)
			{
				if(c[n-3]==b[n-2])//可以去掉最大
				{
					num1=b[n-1];
				}
			}
			num2=c[n-2]-b[n-1];int maxcount=0;
			if(num2>b[n-1])System.out.println(0);
			else if((num2==b[n-1])&&c[n-3]!=b[n-2]) //相等特殊判断
			{
				System.out.println(0);
			}
			else {			
			for(int i=0;i<n;i++)
			{
				if(a[i]==num1||a[i]==num2)
				{
					list.add(i+1);
				}
				
			}
			if(list.size()==0)
			{
				System.out.println(0);
			}
			else {
				System.out.println(list.size());
				for(int j=0;j<list.size();j++)
				{
					System.out.print(list.get(j)+" ");
				}
			}
		}
		}
	}

}
