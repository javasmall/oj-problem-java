package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class testB {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		in.nextToken();int k=(int)in.nval;
		List<Integer>list=new ArrayList<>();
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			in.nextToken();int a=(int)in.nval;
			set.add(a);
		}
		for(int q1:set)
		{
			if(q1!=0)
			{
				list.add(q1);
			}
		}
		list.sort(null);int va=0;int count=0;
		for(int q=0;q<list.size();q++)
		{
			int te=list.get(q);//System.out.println("list"+te);
			if(te-va==0) {continue;}
			else {
				System.out.println(te-va);
				va+=te-va;
				count++;
				//System.out.println(count+" "+va);
				if(count>=k) {break;}
			}
		}
		while(count++<k)
		{
			System.out.println(0);
		}
			
		   
		}
	

}
