package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class test15 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		long max=1000000007 ;
		long dpcount[]=new long[n+1];//表示从这个点到任意点的情况
		long dp[]=new long[n+1];//表示开头到结尾的，
		dp[1]=1;//只有两个元素的情况下只能到同一列
		dpcount[1]=1;
		dp[2]=2;
		dpcount[2]=6;//  24/4=6  四个点
		
		for(int i=3;i<n+1;i++)
		{
			dp[i]=dp[i-1]*2;
			dp[i]%=max;
			dpcount[i]=(dp[i]+dpcount[i-1]*2+dpcount[i-2]*4)%max;
			
		}
		long sum=4*dpcount[n]%max;
		for(int i=2;i<n;i++)
		{
			sum+=(dp[i]*dpcount[n-i]+dpcount[i-1]*dp[n-i+1])*4;
			sum%=max;
		}
		out.println(sum);		out.flush();
	}
}
