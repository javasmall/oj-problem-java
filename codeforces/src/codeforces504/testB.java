package codeforces504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testB {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		long n=(long)in.nval;
		in.nextToken();
		int q=(int)in.nval;
		
		for(int i=0;i<q;i++)
		{
			in.nextToken();long x=(long)in.nval;
			in.nextToken();long y=(long)in.nval;
			if((x+y)%2==0) {
				long num=(n*(x-1)+1)/2+(y+1)/2;
				out.println(num);
			}
			else
			{
				long num=(1+n*n)/2+(n*(x-1))/2+(y+1)/2;
				out.println(num);
			}
			out.flush();
		}
		
	}
}
