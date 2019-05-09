package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu1576 {
     static long x=0,y=0;
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int t=(int)in.nval;
		for(int j=0;j<t;j++)
		{
			in.nextToken();
			long a=(long)in.nval;
			in.nextToken();
			long b=(long)in.nval;
			extgcd(b, 9973);
			while(x<0)
			{
				x+=9973;
				y-=a;
			}
			long value=a*(x%9973)%9973;
			out.println(value);
		}
        out.flush();
	}
	static long extgcd(long a,long b)
	{
		if(b==0) {x=1;y=0;return a;}
		long ans=extgcd(b, a%b);
		long team=x;
		x=y;
		y=team-a/b*y;
		return ans;
	}

}
