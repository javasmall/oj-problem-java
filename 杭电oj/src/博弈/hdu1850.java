package ²©ÞÄ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu1850 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int m=(int)in.nval;
			if(m==0) {break;}
			int a[]=new int[m];
			int sum=0;
			for(int i=0;i<m;i++)
			{
				in.nextToken();
				a[i]=(int)in.nval;
				sum^=a[i];
			}
			int count=0;
			for(int i=0;i<m;i++)
			{
				if(a[i]>(sum^a[i]))count++;
			}
			out.println(count);
			out.flush();
		}
	}
}
