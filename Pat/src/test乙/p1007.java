package test乙;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class p1007 {

	static int prime[];
	static boolean visit[];
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		prime=new int[n*2];
		visit=new boolean[n*2];
		getprime(n);int value=0;
		for(int i=0;i<=n;i++)
		{
			//if(prime[i]>n) {break;}
			if(prime[i+1]-prime[i]==2) {value++;}
		}
		out.println(value);
		out.flush();
		
		

	}
	static void getprime(int n)
	{
		int cnt=0;
		for(int i=2;i<n;i++)
		{
			if(!visit[i])prime[cnt++]=i;
			for(int j=0;j<cnt && i*prime[j]<=n;j++)//当标记的合数超出范围则退出 
			{
				visit[i*prime[j]]=true;
				if(i%prime[j]==0)break;//关键步骤 
			}

		}
	}

}