package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
public class test09 {
    static boolean b[];
   static int max=0,n;
   static List<node>leng[];
   static int deep=0;
	public static void main(String[] args) throws IOException  {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		 n=(int)in.nval;//城市数量
		b=new boolean[n];
		leng=new ArrayList[n];
		for(int i=0;i<n;i++) {leng[i]=new ArrayList();}
		int a3[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			in.nextToken();int a=(int)in.nval;
			in.nextToken();int b=(int)in.nval;
			in.nextToken();int c=(int)in.nval;
			leng[a-1].add(new node(b-1,c));
			leng[b-1].add(new node(a-1,c));
		}	
		b[0]=true;
		dfs(0,0);
		b[0]=false;//从0第一个节点确定最深
		b[deep]=true;
		dfs(deep,0);
		b[deep]=false;		
		double ave=((double)max+1)/(double)2+10;
		double value=ave*max;
		out.println((int)value);out.flush();
	}
	private static void dfs(int i, int j) {
		if(j>max) {max=j;deep=i;}
		for(int q=0;q<leng[i].size();q++)
		{
			int team=leng[i].get(q).x;
			if(leng[i].get(q).distance>0&&!b[team])
			{
				b[team]=true;
				dfs(team,j+leng[i].get(q).distance);
				b[team]=false;
			}
		}	
	}
	static class node
	{
		int x;//位置
		int distance;//距离
		public node() {}
		public node(int x,int distance)
		{
			this.x=x;this.distance=distance;
		}
	}
}
