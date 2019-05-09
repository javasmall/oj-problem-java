package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testw {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int a[]=new int[10005];a[0]=1;
		for(int i=1;i<10005;i++)
		{
			long x=i*i+i+41;
			if(isprime(x)) {a[i]=a[i-1]+1;}
			else {a[i]=a[i-1];}
		}
      // in.nextToken();int t=(int)in.nval;
       while(in.nextToken()!=StreamTokenizer.TT_EOF)
       {
    	   int m=(int)in.nval;in.nextToken();
    	   int n=(int)in.nval;
    	  int  team=m==0?0:a[m-1];
    	  double value=(double)(a[n]-team)*100.0/(double)(n-m+1);
    	  out.println(String.format("%.2f", value));
    	  out.flush();
       }
	}
	private static boolean isprime(long x) {
		if(x<=2)return true;
		else {
			for(int i=2;i*i<x+1;i++)
			{
				if(x%i==0)return false;
			}
			return true;
				}
		
	}

}
