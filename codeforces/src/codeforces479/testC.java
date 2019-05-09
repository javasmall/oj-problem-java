package codeforces479;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testC {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		in.nextToken();int k=(int)in.nval;
		List<Integer>list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			in.nextToken();int exam=(int)in.nval;
			list.add(exam);
		}
		list.sort(null);
		if(k==0) {if(list.get(0)==1)out.println(-1);else out.println(1);}
		else if(k==n)out.println(list.get(k-1));
		else if(list.get(k-1).equals(list.get(k))) {out.println(-1);}
		else {out.println(list.get(k-1));}
		out.flush();
	}
}
