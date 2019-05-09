package codeforces506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testA {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int n=(int)in.nval;
		in.nextToken();int t=(int)in.nval;
		in.nextToken();String s=in.sval;
		int x=0;String s2=s;
		for(int i=1;i<n;i++)
		{
			
			if(s.substring(0,i).equals(s.substring(n-i)))
			{
				x=i;
			}
			
		}
		//out.println(x);
		for(int i=0;i<t-1;i++)
		{
			s2+=s.substring(x);
		}
		out.println(s2);out.flush();

	}

}
