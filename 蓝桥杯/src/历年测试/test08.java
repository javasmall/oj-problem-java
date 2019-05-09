package ¿˙ƒÍ≤‚ ‘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class test08 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int a=(int)in.nval;
		in.nextToken();int b=(int)in.nval;
		int c=a*b;
		int min=c-1;
		while(true)
		{
			if(jud(min,a,b))
				min--;
			else
				break;
		}
	    out.println(min);out.flush();
	}
	private static boolean jud(int min, int a, int b) {
		int x1=min/a;int x2=min/b;
		for(int i=0;i<x1+1;i++)
		{
			for(int j=0;j<x2+1;j++)
			{
				if(i*a+j*b==min)return true;
				else if(i*a+j*b>min)break;
			}
		}
		return false;
	}
}
