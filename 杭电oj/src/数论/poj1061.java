package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class poj1061 {

	static long X=0; static long Y=0;
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();long x=(long)in.nval;//A起始位置
		in.nextToken();long y=(long)in.nval;//B起始位置
		in.nextToken();long m=(long)in.nval;//A的速率
		in.nextToken();long n=(long)in.nval;//B的速率
		in.nextToken();long L=(long)in.nval;//长度

		long a=m-n;
		long c=y-x;
		long b=L;
		if(a<0) {a=-a;c=-c;}
		long res=extgcd(a,b);//  res=gcd(a,b)
		//c必须是res的倍数，如果互质的话就不满足拓展欧几里得的方程式，而对应的结果首先要跟着倍数扩大
		if(c%res!=0) {out.println("Impossible");}
		else {
			/*
			 * 可能难理解一点
			 * x=x0+(b/gcd(a,b))*t
			 * x=x0+(b/res)*t找到最小的正整数x,那么就是x%(b/res)了，如果小于0就是(x%b/res)+b/res了
			 */
			 X=X*(c/res);
            long t=b/res;
            if(X>=0)
                X=X%t;
            else
                X=X%t+t;
		    out.println(X);
		}
		out.flush();

	}
	private static long extgcd(long a, long b) {
		if(b==0)
		{
			X=1;Y=0;
			return a;
		}
		long res=extgcd(b, a%b);
		long team=X;
		X=Y;
		Y=team-(a/b)*Y;
		return res;
	}
}
