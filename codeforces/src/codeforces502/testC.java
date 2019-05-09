package codeforces502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class testC {
		public static void main(String[] args) throws IOException {
			StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 
			 in.nextToken();
			 int n=(int)in.nval;
			 int j=(int) Math.sqrt(n);
			
			 for(int i=1;i<=n;i+=j)
			 {
				if(i<=n-j)
				{
					for(int q=0;q<j;q++)
					{
						out.print(q+(n-i+2-j)+" ");
					}
				}
				else
				{
					int q=0;
					while(q+i<=n)
					{
						out.print(q+1+" ");
						q++;
					}
				}
			 }
              out.flush();
	}

}
