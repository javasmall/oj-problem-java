package codeforces494;

import java.util.Scanner;

public class codeC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double max=0.0;
       int n=sc.nextInt();//总个数
        int k=sc.nextInt();
        int a[]=new int[(int) n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
       int dp[][]=new int [n+1][n];//长度为k,第n个数截至的总和/
        //计算长度为1到长度为k的
        for(int i=0;i<n;i++)
        {dp[1][i]=a[i];}
        for(int i=2;i<n+1;i++)
        {
        	for(int j=i-1;j<n;j++)
        	{dp[i][j]=dp[i-1][j-1]+a[j];
        	if(i>=k)
        	{
        		if((double)dp[i][j]/i>max)
        		{
        			max=(double)dp[i][j]/i;
        		}
        	}
        	}
        }
        if(k==1)
        {
        	for(int i=0;i<n;i++)
        	{
        		if(a[i]>max)
        		{max=a[i];}
        	}
        }
//        for(int i=0;i<n;i++)
//        {
//        	System.out.print(dp[4][i]+" ");
//        }
        System.out.println(max);
	}
}
