package ¿˙ƒÍ≤‚ ‘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class test07 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int n=(int)in.nval;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			a[i]=(int)in.nval;			
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			int min=1000000;int max=0;
			for(int j=i;j<n;j++)
			{
				
				if(a[j]<min) {min=a[j];}
				if(a[j]>max) {max=a[j];}
				if(max-min==j-i)count++;
			}
		}
		out.println(count);out.flush();		
	}
}
