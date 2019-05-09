package codeforces479;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class testD {

	public static void main(String[] args) throws IOException {
//		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//		in.nextToken();long qq=Long.parseLong(in.);
//		System.out.println(qq/3+" "+qq);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		long s=Long.parseLong(br.readLine());
//		System.out.println(s/3+" "+s);
		//System.out.println(Long.MAX_VALUE);
	
		int n=Integer.parseInt(br.readLine());
		//long a[]=new long[n];
		Queue<node>q1=new PriorityQueue(com);long max=0;
		String str[]=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			long exam=Long.parseLong(str[i]);;///if(exam>max)max=exam;
			long two=search2(exam);
			long three=search3(exam);
			q1.add(new node(exam,two,three));
		}
		//list.sort(com);
		while(!q1.isEmpty())
		{
			//if(n==100) {out.println(list.get(i).node3+" ");}
			out.print(q1.poll().exam+" ");
		}
		//out.println(max);
		out.flush();
	}
	static Comparator<node> com= new Comparator<node>() {

		public int compare(node o1, node o2) {
		
			if(o1.node3==o2.node3)//
			{
				return (int) (o1.node2-o2.node2);
			}
			else
				return (int) (o2.node3-o1.node3);
		}
	

	};	
	
	public static long search3(long exam) {
		long num=0;
		while(exam%3==0)
		{
			exam/=3;
			num++;
		}
		return num;
	}
	private static long search2(long exam) {
		long num=0;
		while(exam%2==0)
		{
			exam/=2;
			num++;
		}
		return num;
	}
	public static class node
	{
		long node2;
		long node3;
		long exam;
		
		public node(long exam,long node2,long node3)
		{
			this.exam=exam;
			this.node2=node2;
			this.node3=node3;
		}
	}

}
