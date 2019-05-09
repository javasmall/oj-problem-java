package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class pat59 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int n=(int)in.nval;//数量
		in.nextToken();int p=(int)in.nval;//常数
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			in.nextToken();a[i]=(int)in.nval;
		}
		Arrays.sort(a);
		int dp[]=new int[n];int length=0;
		for(int i=0;i+length<n;i++)
		{
			for(int j=i+length;j<n;j++)
			{
				if(a[i]*p>=a[j]) {length++;}
				else
					break;
			}
		}
		out.println(length);
		out.flush();
	}
}
