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
		//System.out.println(1%(-5));
		in.nextToken();long x=(long)in.nval;
		in.nextToken();long y=(long)in.nval;
		in.nextToken();long m=(long)in.nval;
		in.nextToken();long n=(long)in.nval;
		in.nextToken();long k=(long)in.nval;
		//m*Q +x-(n*Q+y)=k*W;
		//Q(m-n)-W*k=y-x;
		//Xa+Y*k=b
		
//		boolean bool=false;
//		if((m-n)%(y-x)!=0||k%(y-x)!=0)
//		{
//			b=true;
//		}
		long a=m-n;
		long c=y-x;
		
		if(a<0) {a=-a;c=-c;}
		long res=extgcd(a,k);//1 5
		if(c%res!=0) {out.println("Impossible");}
		else {
			 X=X*c/res;
            long t=k/res;
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
