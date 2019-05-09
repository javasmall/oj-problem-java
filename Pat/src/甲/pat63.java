package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class pat63 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s=in.readLine();
		int []p=new int[s.length()];
		int []pa=new int[s.length()];
		int[]pat=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if(i==0) {
			if(s.charAt(i)=='P')
			{
				p[0]=1;
			}}
			else {
			 if(s.charAt(i)=='P')
			{
				p[i]=p[i-1]+1;
				pa[i]=pa[i-1];
				pat[i]=pat[i-1];
			}
			else if(s.charAt(i)=='A')
			{
				p[i]=p[i-1];
				pa[i]=(pa[i-1]+p[i]);
				pat[i]=pat[i-1];
			}
			else if(s.charAt(i)=='T')
			{
				p[i]=p[i-1];
				pa[i]=pa[i-1];
				pat[i]=(pat[i-1]+pa[i])%1000000007;
			}}
		}
		out.println(pat[s.length()-1]);
		out.flush();

	}

}
