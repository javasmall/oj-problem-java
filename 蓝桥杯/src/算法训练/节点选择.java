package 算法训练;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
public class 节点选择 {
    // static boolean jud[];
     static int dp[][];//dp数组
     static int value[];//保存权值
     static List <Integer>[]list;//邻接表储存图。节省空间
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		value=new int[n];//权值
		dp=new int[n][2];
		list=new ArrayList[n];
		
		for(int i=0;i<n;i++) {list[i]=new ArrayList<>();}
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			value[i]=(int)in.nval;
		}
		for(int i=0;i<n-1;i++)
		{
		   in.nextToken();	int t1=(int)in.nval;
			in.nextToken();int t2=(int)in.nval;
			list[t1-1].add(t2-1);//添加路径
			list[t2-1].add(t1-1);			
		}
		dfs(0,-1);//理论上任意n之内节点都可以，但是右侧第一个理论上保证不是这个点的父亲
		int value=max(dp[0][0], dp[0][1]);
		out.println(value);
		out.flush();
	}

	private static void dfs(int x, int y) {//当前节点，父亲节点
		for(int i=0;i<list[x].size();i++)
		{
			int num=list[x].get(i);
			if(num!=y)//不是父亲节点
			{
				dfs(num,x);
				dp[x][0]+=max(dp[num][0],dp[num][1]);
				dp[x][1]+=dp[num][0];
			}
		}
		dp[x][1]+=value[x];//加上自己的权值
		
	}

	private static int max(int i, int j) {
		// TODO 自动生成的方法存根
		return i>=j?i:j;
	}

}
