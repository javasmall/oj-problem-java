package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class test01 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int a=(int)in.nval;
		in.nextToken(); int b=(int)in.nval;
		in.nextToken();int c=(int)in.nval;
		int ab=gcd(a,b);ab=a*b/ab;
		int abc=gcd(ab,c);abc=ab*c/abc;
		
		//System.out.println(ab+" "+bc+" "+ac);
		out.println(abc);
		out.flush();
	}
	private static int gcd(int a, int b) {
		if(b==0)return a;
		else
			return gcd(b,a%b);
	}
}
