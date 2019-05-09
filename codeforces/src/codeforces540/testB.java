package codeforces540;

import java.util.Scanner;

public class testB {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//number
		int a[]=new int [n+1];
		int sumji[]=new int[n+1];
		int sumou[]=new int[n+1];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(i==1) {sumji[i]=a[i];sumou[i]=sumou[0];}
			else if(i==0) {sumou[i]=a[i];}
			else if(i%2==0) {sumou[i]+=a[i]+sumou[i-2];sumji[i]=sumji[i-1];}
			else {sumji[i]+=sumji[i-2]+a[i];sumou[i]=sumou[i-1];}
		}
		if(sumou[n-1]-a[0]==sumji[n-1])count++;if(n==1) {System.out.println(count);return;}
		if(sumji[n-1]+a[0]-a[1]==sumou[n-1]-a[0])count++;if(n==2) {System.out.println(count);return;}
	
		for(int i=2;i<n;i++)
		{
			int ji=sumji[i];
			int ou=sumou[i];
			if(i%2==0) {//偶
				ou-=a[i];
				ou+=sumji[n-1]-sumji[i];
				ji+=sumou[n-1]-sumou[i];
			}
			else {//奇数
				ji-=a[i];
				ou+=sumji[n-1]-sumji[i];
				ji+=sumou[n-1]-sumou[i];
			}
			if(ji==ou)count++;
			
		}
		System.out.println(count);

	}

}
