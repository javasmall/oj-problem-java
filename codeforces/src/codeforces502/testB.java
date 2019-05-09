package codeforces502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testB {

		public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 
			
			 int n=Integer.parseInt(in.readLine());
			 
			String s=in.readLine();
			 String s2=in.readLine();
			 
			 int a[]=new int[n];int b[]=new int[n];
			 for(int i=0;i<n;i++)
			 {
				 a[i]=Integer.parseInt(s.charAt(i)+"");
				 b[i]=Integer.parseInt(s2.charAt(i)+"");
			 }
			 long  c[][]=new long[2][2];
			 for(int i=0;i<n;i++)
			 {
				 c[a[i]][b[i]]++;
			 }
			long number=0;
			 number=c[1][1]*c[0][0]+c[1][0]*(c[0][0]+c[0][1]);
			 out.println(number);
			 
			 out.flush();
	}

}
