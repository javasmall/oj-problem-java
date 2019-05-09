package codeforces481;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testA {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		int a[]=new int[n];
		List<Integer> list=new ArrayList();
		//Map<Integer,Integer>map=new HashMap();
		
		for(int i=0;i<n;i++)
		{
			in.nextToken();a[i]=(int)in.nval;	
		}
		for(int i=n-1;i>=0;i--)
		{
			if(!list.contains(a[i]))
				list.add(a[i]);
		}
		out.println(list.size());
		for(int i=list.size()-1;i>=0;i--)
		{
			out.print(list.get(i)+" ");
		}
		out.flush();
	}
}
