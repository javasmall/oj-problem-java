package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class test3 {

	public static void main(String[] args) throws IOException {
		
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		int a[]=new int[n];
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			in.nextToken();
		    a[i]=(int)in.nval;
		    //if(i>0&&a[i-1]>a[i]) {b=true;}
		}
		List<Integer>list=new ArrayList<Integer>();
		List<Integer>list2=new ArrayList<Integer>();
		int count=0;
		for(int i=n-1;i>=0;i--)
		{
			int team=(a[i]+count)%(n+1);
			int more=(n+1+(i+1)-team)%(n+1);
			
			count+=more;
			if(more>0)
			{list.add(more);
			list2.add(i+1);}
		}
		System.out.println(list.size()+1);
		for(int i=0;i<list.size();i++ )
		{
			System.out.println(1+" "+list2.get(i)+" "+list.get(i));
		}
		//if(b==true)
		System.out.println(2+" "+n+" "+(n+1));
		

	}

}
