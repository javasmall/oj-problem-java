package codeforces496;

import java.util.Scanner;

public class testD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char num[]=s.toCharArray();
		int number[]=new int[num.length];
		for(int i=0;i<number.length;i++)
		{
			number[i]=num[i]-'0';
		}
		int dp[]=new int[number.length];
		if(number[0]%3==0)dp[0]=1;
		else dp[0]=0;
		for(int i=1;i<number.length;i++)
		{
			if(number[i]%3==0)dp[i]=dp[i-1]+1;
			else
			{
				dp[i]=dp[i-1];//Ô¤´¦Àí
				int team=number[i];
				for(int j=i-1;j>=0;j--)
				{	
					if(dp[j]!=dp[i]) {break;}
					else if(j>0) {
						if(dp[j]==dp[i]) {
							team+=number[j];
							if(team%3==0) {dp[i]=dp[j-1]+1;break;}
						}
					}	
					else if(j==0)
					{
						team+=number[j];
						if(team%3==0) {dp[i]=dp[j]+1;break;}
					}
				}
			}
		}
		
        System.out.println(dp[number.length-1]);
	}
}
