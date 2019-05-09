package codeforces481;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testB {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int index=0,count=0;
		int n=(int)in.nval;
		in.nextToken();
		String s=in.sval;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='x')
			{
				index++;
				if(index>=3) {count++;}
			}
			else
			{
				index=0;
			}
		}
		out.println(count);out.flush();
	}
}
