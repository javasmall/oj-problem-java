package ¿˙ƒÍ≤‚ ‘;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test{

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int a[]=new int[1000];
		a[0]=1;a[1]=1;
		for(int i=2;i<1000;i++)
		{
			a[i]=a[i-2]+a[i-1];
			if(a[i]>=1000)
				{out.println(i+" "+a[i]+" "+a[i-1]);break;}
			
		}
		out.flush();
		
	}

}
