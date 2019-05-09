package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class pat31 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int k=(int)in.nval;
		int a[]=new int [54];
		int b[]=new int[54];
		int team[]=new int[54]; 
		String huase[]=new String[54];
		for(int i=0;i<54;i++)
		{
			if(i<13) {huase[i]="S"+(i+1);}
			else if(i<26) {huase[i]="H"+(i%13+1);}
			else if(i<39) {huase[i]="C"+(i%13+1);}
			else if(i<52) {huase[i]="D"+(i%13+1);}
			else if(i==52) {huase[i]="J1";}
			else huase[i]="J2";
		}
		for(int i=0;i<54;i++)
		{
			b[i]=i+1;
		}
		for(int i=0;i<54;i++)
		{
			in.nextToken();
			a[i]=(int)in.nval;
		}
		for(int i=0;i<k;i++)
		{
			
			for(int j=0;j<54;j++)
			{
				team[a[j]-1]=b[j];
			}
			b=team.clone();
		}
		for(int i=0;i<54;i++)
		{
			out.print(huase[b[i]-1]+" ");
		}
		out.flush();
	}
}
