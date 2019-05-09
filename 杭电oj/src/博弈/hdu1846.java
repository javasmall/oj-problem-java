package ²©ÞÄ;
/*
 * °ÍÊ¿²©ÞÄ
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class hdu1846 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int k=(int)in.nval;
		for(int i=0;i<k;i++)
		{
			in.nextToken();int n=(int)in.nval;
			in.nextToken();int m=(int)in.nval;
			if(n%(m+1)!=0) {out.println("first");}
			else
				out.println("second");
			out.flush();
		}

	}

}
