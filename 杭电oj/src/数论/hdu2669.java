package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/*
 * ��չŷ�����
 */
public class hdu2669 {
      static long x=0;static long y=0;
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			long a=(long)in.nval;
			in.nextToken();
			long b=(long)in.nval;
			long q=tgcd(a,b);
			if(1%q!=0) {out.println("sorry");}//gcdҪ��Ҫ����ȣ��������1��
			else {
				while(x<=0){//x*a+y*b=1  Ҫ��x>0��������Ҫ��x��С����ô�����������൱��+ab-ab�������տ�ʼ��û����
					x+=b;
					y-=a;
				}
				out.println(x+" "+y);}//
			out.flush();
		}		
	}
	static long tgcd(long a,long b)
	{
		if(b==0) {x=1;y=0;return a;}
		long ans=tgcd(b,a%b);
		long team=x;
		x=y;
		y=team-a/b*y;
		return ans;
		
	}
}
