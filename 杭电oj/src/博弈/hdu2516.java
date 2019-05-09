package ²©ÞÄ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu2516 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		long a[]=new long[100];
		a[0]=a[1]=1;
		for(int i=2;i<50;i++)
		{
			a[i]=a[i-1]+a[i-2];
			
		}
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			boolean b=false;
			long n=(long)in.nval;
			if(n==0) {break;}
			for(int i=0;i<50;i++)
			{
				if(a[i]==n) {b=true;}
			}
			if(b) {out.println("Second win");}
			else out.println("First win");
			out.flush();
		}		

	}
}
