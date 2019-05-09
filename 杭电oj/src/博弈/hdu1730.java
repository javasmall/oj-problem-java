package ²©ÞÄ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu1730 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int)in.nval;
			in.nextToken();int m=(int)in.nval;int value=0;
			for(int i=0;i<n;i++)
			{
				in.nextToken();int x1=(int)in.nval;
				in.nextToken();int x2=(int)in.nval;
				value^=(Math.abs(x1-x2)-1);
			}
			if(value==0) {out.println("BAD LUCK!");}
			else out.println("I WIN!");out.flush();
		}
	}
}
