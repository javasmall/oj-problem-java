package �㷨ѵ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
public class �ڵ�ѡ�� {
    // static boolean jud[];
     static int dp[][];//dp����
     static int value[];//����Ȩֵ
     static List <Integer>[]list;//�ڽӱ���ͼ����ʡ�ռ�
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		value=new int[n];//Ȩֵ
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
			list[t1-1].add(t2-1);//���·��
			list[t2-1].add(t1-1);			
		}
		dfs(0,-1);//����������n֮�ڽڵ㶼���ԣ������Ҳ��һ�������ϱ�֤���������ĸ���
		int value=max(dp[0][0], dp[0][1]);
		out.println(value);
		out.flush();
	}

	private static void dfs(int x, int y) {//��ǰ�ڵ㣬���׽ڵ�
		for(int i=0;i<list[x].size();i++)
		{
			int num=list[x].get(i);
			if(num!=y)//���Ǹ��׽ڵ�
			{
				dfs(num,x);
				dp[x][0]+=max(dp[num][0],dp[num][1]);
				dp[x][1]+=dp[num][0];
			}
		}
		dp[x][1]+=value[x];//�����Լ���Ȩֵ
		
	}

	private static int max(int i, int j) {
		// TODO �Զ����ɵķ������
		return i>=j?i:j;
	}

}
