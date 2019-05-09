package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu1100 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		long dp[]=new long[100];long sum[]=new long[100];
		dp[1]=1;sum[1]=dp[1];
		for(int i=2;i<100;i++)
		{
			dp[i]=dp[i-1]*(4*i-2)/(i+1);
			sum[i]+=dp[i]+sum[i-1];
		}
//		for(int i=0;i<20;i++)
//		{
//			System.out.println(sum[i]);
//		}
		in.nextToken();
		int nu=(int)in.nval;
		int k=1;
		while(sum[k]<nu)
		{
			k++;
		}
		long cha=sum[k]-nu;
		System.out.println(k+" "+sum[k]+" "+sum[k-1]);
	}

}
