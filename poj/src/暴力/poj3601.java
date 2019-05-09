package 暴力;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class poj3601 {
/*
 * 二分法
 */
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
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
				int r=(len==Integer.MAX_VALUE?a:(len+l>a?a:len+l));//右面长度存在不，不存在从a二分。如果存在加上这个点保证不能越界
				boolean jud=false;//用于终止循环
				while(true)
				{		
					if(sum[r]-sum[l]>=b)//如果大于目标进行二分
					{
						if(r-l<len) {len=r-l;}
					    r=(l+r)/2;	
					}
					else//小于目标直接向右增加寻找目标，找到的第一个就是极限最短，在这区间不能越界，长度不能超多已经知道最短长度
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
