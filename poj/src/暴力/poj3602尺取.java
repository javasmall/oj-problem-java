package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class poj3602��ȡ {
/*
 * ��ȡ��
 */
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int t=(int)in.nval;
		for(int i=0;i<t;i++)
		{
			in.nextToken();int a=(int)in.nval;
			in.nextToken();int b=(int)in.nval;
			int c[]=new int[a]; int len=Integer.MAX_VALUE;
			long sum=0;
			for(int j=0;j<a;j++)
			{
				in.nextToken();c[j]=(int)in.nval;		
			}		
			sum=c[0];int l=0;int r=1;
			for(int j=1;j<a;j++)
			{
				sum+=c[j];
				while(sum>b)
				{
					if(len>j-l) {len=j-l;}
					if(len<=0) {break;}
					sum-=c[l++];
				}
			}
			
			if(len!=Integer.MAX_VALUE) {out.println(len+1);}
			else out.println(0);			
		}
		out.flush();

	}

}
