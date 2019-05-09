package 矩阵乘法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class hdu4920 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		while (in.nextToken()!=StreamTokenizer.TT_EOF) {
			int n=(int)in.nval;
			int a[][]=new int[n][n];
			int b[][]=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					in.nextToken();
					a[i][j]=(int)in.nval%3;
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					in.nextToken();
					b[i][j]=(int)in.nval%3;
				}
			}
			int c[][]=mutpate(a,b,n);
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(j==n-1)
					{out.print(c[i][j]%3);}
					else 
					out.print(c[i][j]%3+" ");
				}
			 out.println();
			}out.flush();
			
			
		}

	}

	private static int[][] mutpate(int[][] a, int[][] b, int n) {
		// TODO 自动生成的方法存根
		int c[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				for(int q=0;q<n;q++)
				{
					c[i][j]+=(a[i][q])*(b[q][j]);
					//c[i][j]%=3;
				}
			}
		}
		return c;
	}

}
