package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class pat14 {

	public static void main(String[] args) throws IOException {
		
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int n=(int)in.nval;
		in.nextToken();double p=(double)in.nval;
		in.nextToken();double pecent=(double)in.nval;
		ArrayList son[]=new ArrayList[n];
		int num[]=new int[n];
		double value[]=new double[n];
		for(int i=0;i<n;i++)
		{
			son[i]=new ArrayList();
			in.nextToken();int number=(int)in.nval;//从它这边买走东西的人口
			if(number==0) {in.nextToken();int qq=(int)in.nval;num[i]=qq;}
			else for(int j=0;j<number;j++)
			{
				in.nextToken();int qq=(int)in.nval;
				son[i].add(qq);//添加儿子				
			}
		}
		double count=0;
		Queue<Integer> q1=new ArrayDeque();
		q1.add(0);value[0]=p;
		while(!q1.isEmpty())
		{
			int q=q1.poll();
			if(son[q].size()==0)
			{
				count+=num[q]*value[q];
			}
			else
			for(int i=0;i<son[q].size();i++)
			{
				q1.add((int)son[q].get(i));
				value[(int)son[q].get(i)]=value[q]*(100+pecent)/100;
			}
			
		}	
		out.println(String.format("%.1f", count));out.flush();
	}
}
