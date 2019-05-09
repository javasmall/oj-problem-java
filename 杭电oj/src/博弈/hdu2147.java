package ²©ÞÄ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu2147 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 		
		 while(in.nextToken()!=StreamTokenizer.TT_EOF)
		 {
			 int n=(int)in.nval;
			 in.nextToken();
			 int m=(int)in.nval;
			 if(m==0&&n==0) {break;}
			 if(m%2==0||n%2==0)
			 {
				 out.println("Wonderful!");
			 }
			 else
				 {out.println("What a pity!");}
			 out.flush();			 
		 }
	}
}
