package ¿˙ƒÍ≤‚ ‘;

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

public class test12 {
    static boolean b[];
	static List list2;
	static List list[];
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		in.nextToken();
		int m=(int)in.nval;
		list=new ArrayList[n];
		b=new boolean[n];
		for(int i=0;i<n;i++)
		{
			list[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++)
		{
			in.nextToken();int a=(int)in.nval;
			in.nextToken();int b=(int)in.nval;
			list[a-1].add(b-1);
			list[b-1].add(a-1);
		}
		in.nextToken();int v=(int)in.nval;
		in.nextToken();int u=(int)in.nval;
		list2=new ArrayList<Integer>();
		b[v-1]=false;
		List<Integer> l1=new ArrayList();
		Map<Integer,Integer>map=new HashMap();
		
//		for(int i=0;i<list.length;i++)
//		{
//			for(int j=0;j<list[i].size();j++)
//			{
//				System.out.print(list[i].get(j));
//			}
//			System.out.println();
//		}
		
		dfs(l1,v-1,u-1);
		for(int i=0;i<list2.size();i++)
		{
			if(map.containsKey(list2.get(i))) {map.put((int) list2.get(i), map.get(list2.get(i))+1);}
			else
				map.put((int) list2.get(i), 1);
		}
//		for(int i=0;i<list2.size();i++)
//		{System.out.print(list2.get(i));}
//		System.out.println();
		if(list2.size()==0) {System.out.println(-1);}
		
		else {
		int count=0;
		int num=0;
		for(int i:map.keySet())
		{
			
			if(map.get(i)>num)
			{
				count=1;num=map.get(i);
			}
			else if(map.get(i)==(num))
			{
				count++;
			}
		}
		System.out.println(count);}
	}
	private static void dfs(List<Integer> l1,  int v, int u) {
		//System.out.println(v);
		if(u==v) {list2.addAll(l1);}
		else
		{
			for(int i=0;i<list[v].size();i++)
			{
				int index=(int) list[v].get(i);
				if(!b[index])
				{
					List<Integer> l2=new ArrayList();
					l2.addAll(l1);if(index!=u)l2.add(index);
					//System.out.println(l2.size());
					b[index]=true;
					dfs(l2,index,u);
					b[index]=false;
				}
			}
		}	
	}
}
