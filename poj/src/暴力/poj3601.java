package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class poj3601 {
/*
 * ���ַ�
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
			long sum[]=new long[a+1];//
			for(int j=0;j<a;j++)
			{
				in.nextToken();c[j]=(int)in.nval;
				sum[j+1]+=sum[j]+c[j];
			}		
			int left=0;int right=a;
			for(int j=0;j<a;j++)
			{
				int l=j;
				int r=(len==Integer.MAX_VALUE?a:(len+l>a?a:len+l));//���泤�ȴ��ڲ��������ڴ�a���֡�������ڼ�������㱣֤����Խ��
				boolean jud=false;//������ֹѭ��
				while(true)
				{		
					if(sum[r]-sum[l]>=b)//�������Ŀ����ж���
					{
						if(r-l<len) {len=r-l;}
					    r=(l+r)/2;	
					}
					else//С��Ŀ��ֱ����������Ѱ��Ŀ�꣬�ҵ��ĵ�һ�����Ǽ�����̣��������䲻��Խ�磬���Ȳ��ܳ����Ѿ�֪����̳���
					{
						for(;r<=a+1;r++)
						{							
							if(r>a) {jud=true;break;}
							if(r-l>=len) {jud=true;break;}
							if(sum[r]-sum[l]>=b) {len=r-l;break;}
						}					
					}
					if(jud) {break;}
				}
			}
			if(len!=Integer.MAX_VALUE) {out.println(len);}
			else out.println(0);
			
			
		}
		out.flush();

	}

}
