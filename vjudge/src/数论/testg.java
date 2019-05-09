package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testg {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		in.nextToken();
		int t = (int) in.nval;
		for (int i = 0; i < t; i++) {
			in.nextToken();
			long a = (long) in.nval;
			int num = 0;

			out.println("Case " + (i + 1) + ": " + H(a));
		}
		out.flush();
	}
static	long H( Long n ) {
	long value=0;int num=1;
	    while(n/(num)>100000)
	    {
	    	long t=n/(num+1)+1;//t-n是1
	    	value+=(n/num-t+1)*num;
	    	num=num+1;
	    }
	    long value2=0;
	    if(n/(num)<=100000)
	    {
	    	long t=n/num;
	    	for( int i = 1; i <= t; i++ )
	            value2 = value2 + n / i;
	    }
	    return value2+value;
	}
}
