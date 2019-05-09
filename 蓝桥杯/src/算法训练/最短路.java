package 算法训练;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
/*
 * spfa算法
 */
public class 最短路 {
	static int leng[];
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;in.nextToken();int m=(int)in.nval;
		List<node>list[]=new ArrayList[n];//存储路径
		for(int i=0;i<n;i++)//声明
		{
			list[i]=new ArrayList<>();
		}
	    leng=new int[n];
		boolean jud[]=new boolean[n];//判断是否在队列内
		for(int i=1;i<n;i++) {leng[i]=Integer.MAX_VALUE;}//初始最长均为max
		for(int i=0;i<m;i++)
		{
			in.nextToken();int u=(int)in.nval;
			in.nextToken();int v=(int)in.nval;
			in.nextToken();int l=(int)in.nval;
			list[u-1].add(new node(v-1, l));				
		}
		Queue<Integer>q1=new ArrayDeque<Integer>();
		q1.add(0);//第一个
		while(!q1.isEmpty())
		{
			int x=q1.poll();
			jud[x]=false;
		   for(int i=0;i<list[x].size();i++)//遍历
		{
			   int index=list[x].get(i).x;//x邻居该节点的编号
			   int length=list[x].get(i).leng;//x到这个邻居的距离
				if(leng[index]>leng[x]+length)
				{
					leng[index]=leng[x]+length;
					if(!jud[index])//队列中没有该点
					{q1.add(index);jud[index]=true;}					
				}					
			}
		}
		for(int i=1;i<n;i++)
		{
			out.println(leng[i]);
		}
		out.flush();
	}
	static class node
	{
		int x;
		int leng;
		public node(int x,int leng)
		{
			this.x=x;
			this.leng=leng;
		}
	}
}