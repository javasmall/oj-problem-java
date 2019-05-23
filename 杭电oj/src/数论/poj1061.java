package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class poj1061 {

	static long X=0; static long Y=0;
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();long x=(long)in.nval;//A��ʼλ��
		in.nextToken();long y=(long)in.nval;//B��ʼλ��
		in.nextToken();long m=(long)in.nval;//A������
		in.nextToken();long n=(long)in.nval;//B������
		in.nextToken();long L=(long)in.nval;//����

		long a=m-n;
		long c=y-x;
		long b=L;
		if(a<0) {a=-a;c=-c;}
		long res=extgcd(a,b);//  res=gcd(a,b)
		//c������res�ı�����������ʵĻ��Ͳ�������չŷ����õķ���ʽ������Ӧ�Ľ������Ҫ���ű�������
		if(c%res!=0) {out.println("Impossible");}
		else {
			/*
			 * ���������һ��
			 * x=x0+(b/gcd(a,b))*t
			 * x=x0+(b/res)*t�ҵ���С��������x,��ô����x%(b/res)�ˣ����С��0����(x%b/res)+b/res��
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
