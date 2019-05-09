package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class pat19 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();long n=(long)in.nval;
		out.print(n+"=");
		if(n==1||isprime(n))
		{
			out.println(n);
		}
		else
		{
			long su=2;int time=0;
			while(n>1)
			{
				
				//if(isprime(su))//ÊÇËØÊý
				{
					//out.println(su+"  6666");out.flush();
					while(n%su==0)
					{
						n/=su;time++;
					}
					if(time>0) {
					out.print(su+(time>1?("^"+time):""));
					if(n!=1) {out.print("*");}}
				}
				su++;
				time=0;
			}
		}
		out.flush();
	}

	private static boolean isprime(long n) {
		for(long j=2;j*j<n;j++)
		{
			if(n%j==0)return false;
		}
		return true;
	}
}
