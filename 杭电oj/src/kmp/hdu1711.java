package kmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class hdu1711 {
static int [] next(int p[])
{
	int next[]=new int[p.length];
	int j=0;int k=-1;next[0]=-1;
	while(j<p.length-1)
	{
		if(k==-1||p[j]==p[k])
		{
			k++;j++;
			next[j]=k;
		}
		else//当前k的下两个数不相等，查看前一个k的下两个是否想等
		{
			k=next[k];
		}
	}
	return next;	
}
static int kmp(int a1[],int b1[])
{
	
	int i=0;//主串a的位置
	int j=0;//模式串b的位置
	int next[]=next(b1);
	while(i<a1.length)
	{
		if(j==-1||b1[j]==a1[i])
		{
			i++;j++;
		}
		else
		{
			j=next[j];//回到上一个相同的
		}
		if(j==b1.length) {return i-j+1;}
	}
	return -1;
}
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int t=(int)in.nval;
		for(int i=0;i<t;i++)
		{
			in.nextToken();int m=(int)in.nval;;in.nextToken();int n=(int)in.nval;;
			int a[]=new int [m];int b[]=new int [n];
			for(int j=0;j<m;j++)
			{
				in.nextToken();a[j]=(int)in.nval;
			}
			for(int j=0;j<n;j++)
			{
				in.nextToken();b[j]=(int)in.nval;
			}
			int value=kmp(a, b);
		    out.println(value);
		}
		out.flush();

	}

}
