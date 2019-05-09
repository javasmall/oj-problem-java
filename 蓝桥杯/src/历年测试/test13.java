package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class test13 {
  //  static boolean bool[][];
    static boolean jud[];
    static int count=0;
    static int n;
    static List list[];
    static int num[];
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken(); n=(int)in.nval;
		in.nextToken();int m=(int)in.nval;
		//bool=new boolean[n][n];
		jud=new boolean[n];
		list=new ArrayList[n];
		num=new int[n];
		for(int i=0;i<n;i++)
		{
			list[i]=new ArrayList();
		}
		for(int i=0;i<m;i++)
		{
			in.nextToken();int a=(int)in.nval;
			in.nextToken();int b=(int)in.nval;
		    list[a-1].add(b-1);list[b-1].add(a-1);
			//bool[a-1][b-1]=true;bool[b-1][a-1]=true;
		}
		for(int i=0;i<n;i++)
		{
			num[i]++;
			dfs(i,i,0);
			num[i]--;
		}
		out.println(count);out.flush();
	}
	private static void dfs(int i, int first, int j) {
		if(j==3) {count++;}
		else
		{
			//int team=list[i].size();
			for(int p=0;p<list[i].size();p++)
			{
				int q=(int)list[i].get(p);
				if(!jud[q])
				{
					if(num[q]==1&&(q!=first||j!=2)) {}//出现两次 并且（不和首位相同/次数不是2次两个一个不满足都会失败）
					else {
					num[q]++;
					jud[q]=true;
					dfs(q,first,j+1);
					jud[q]=false;num[q]--;
					}
					
				}
			}
		}		
	}
}
