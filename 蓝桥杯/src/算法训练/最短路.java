package �㷨ѵ��;
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
 * spfa�㷨
 */
public class ���· {
	static int leng[];
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;in.nextToken();int m=(int)in.nval;
		List<node>list[]=new ArrayList[n];//�洢·��
		for(int i=0;i<n;i++)//����
		{
			list[i]=new ArrayList<>();
		}
	    leng=new int[n];
		boolean jud[]=new boolean[n];//�ж��Ƿ��ڶ�����
		for(int i=1;i<n;i++) {leng[i]=Integer.MAX_VALUE;}//��ʼ���Ϊmax
		for(int i=0;i<m;i++)
		{
			in.nextToken();int u=(int)in.nval;
			in.nextToken();int v=(int)in.nval;
			in.nextToken();int l=(int)in.nval;
			list[u-1].add(new node(v-1, l));				
		}
		Queue<Integer>q1=new ArrayDeque<Integer>();
		q1.add(0);//��һ��
		while(!q1.isEmpty())
		{
			int x=q1.poll();
			jud[x]=false;
		   for(int i=0;i<list[x].size();i++)//����
		{
			   int index=list[x].get(i).x;//x�ھӸýڵ�ı��
			   int length=list[x].get(i).leng;//x������ھӵľ���
				if(leng[index]>leng[x]+length)
				{
					leng[index]=leng[x]+length;
					if(!jud[index])//������û�иõ�
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