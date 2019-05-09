package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class pat35 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int n=(int)in.nval;
		int d[]=new int[n];
		for(int i=0;i<n;i++)
		{
			in.nextToken();d[i]=(int)in.nval;
		}
		in.nextToken();int m=(int)in.nval;
		for(int i=0;i<m;i++)
		{
			in.nextToken();int x1=(int)in.nval;
			in.nextToken();int x2=(int)in.nval;
			if(x1>x2) {int team=x1;x1=x2;x2=team;}
			int value1=0;int value2=0;
			int team=x1;
			while(team!=x2)
			{
				value1+=d[team-1];
				team++;
			}
			while(team!=x1)
			{
				value2+=d[team-1];
				if(team==n)team=1;
				else team++;
			}
			out.println(value1<value2?value1:value2);
		}
		out.flush();
	}
}
