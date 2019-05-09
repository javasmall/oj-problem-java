package ²©ÞÄ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu1849 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 
		
		 while(in.nextToken()!=StreamTokenizer.TT_EOF)
		 {
			int m=(int)in.nval;if(m==0)break;
			int value=0;
			for(int i=0;i<m;i++)
			{
				in.nextToken();
				int x=(int)in.nval;
				value^=x;
			}
			if(value!=0)
			{
				out.println("Rabbit Win!");
			}
			else
				out.println("Grass Win!");
			out.flush();
		 }		 
	}
}
