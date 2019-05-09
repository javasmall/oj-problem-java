package codeforces501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class testA {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		in.nextToken();
		int m=(int)in.nval;
		boolean b[]=new boolean[m+1];
		for(int i=0;i<n;i++)
		{
			in.nextToken();int l=(int)in.nval;
			in.nextToken();int r=(int)in.nval;
			for(int j=l;j<=r;j++)
			{
				b[j]=true;
			}
		}
		List<Integer>list=new ArrayList();
		for(int i=1;i<m+1;i++)
		{
			if(!b[i]) {list.add(i);}
			//System.out.println(b[i]+" "+i);
		}
		out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			if(i==list.size()-1)out.println(list.get(i));
			else out.print(list.get(i)+" ");
		}
         out.flush();
	}

}
