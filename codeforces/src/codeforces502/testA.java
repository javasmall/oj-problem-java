package codeforces502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class testA {
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 
	    in.nextToken();
	    int n=(int)in.nval;
	    int a[]=new int[n];
	    int son=0;
	    for(int i=0;i<n;i++)
	    {
	    	in.nextToken();int x1=(int)in.nval;
	    	in.nextToken();int x2=(int)in.nval;
	    	in.nextToken();int x3=(int)in.nval;
	    	in.nextToken();int x4=(int)in.nval;
	    	a[i]=x1+x2+x3+x4;
	    	
	    }
	    son=a[0];
	    Arrays.sort(a);
	    for(int j=n-1;j>=0;j--)
	    {
	    	if(son==a[j]) {
	    		out.println(n-j);break;}	    	
	    }
	    out.flush();
	
	}

}
