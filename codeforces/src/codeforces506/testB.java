package codeforces506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testB {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		long n=(long)in.nval;
		long a[]=new long [(int) n];
		for(int i=0;i<n;i++)
		{
			in.nextToken();a[i]=(long)in.nval;
		}
		
		int leng=1;int max=1;
		for(int i=0;i<n;i+=leng)
		{
		    leng=1;
			//out.print(i+" "+leng+" "+n);
			if(leng+i>=n) {break;}
			else
			if(a[i+leng-1]*2>=a[i+leng])
			{
				
				for(int j=i+leng;j<n;j++)
				{
					
					if(a[j-1]*2>=a[j]) {leng++;}
					else break;
				}
			}
			if(leng>max) {max=leng;}
		}
		out.println(max);out.flush();

	}

}
