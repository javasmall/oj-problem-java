package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class pat45 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		int n=(a.length+2)/3;int n2=a.length+2-n*2;
		//out.println(n+" "+n2+" "+a.length);
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				for(int j=0;j<n2;j++)
				out.print(a[j+i]);				
			}
			else
			{
				out.print(a[i]);
				for(int j=0;j<n2-2;j++)
				{
					out.print(" ");
				}
				out.print(a[a.length-i-1]);
			}
			out.println();
		}
		out.flush();
	}
}
