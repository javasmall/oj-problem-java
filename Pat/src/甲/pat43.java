package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class pat43 {
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int m=(int)in.nval;
		in.nextToken();int n=(int)in.nval;
		Map<Integer,Integer>map=new HashMap();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				in.nextToken();int team=(int)in.nval;
				if(map.containsKey(team)) {map.put(team, map.get(team)+1);}
				else map.put(team, 1);
			}
		}
		int max=0;int maxnumber=0;
		for(int a:map.keySet())
		{
			if(map.get(a)>max)
			{
				max=map.get(a);
				maxnumber=a;
			}
		}
		out.println(maxnumber);out.flush();
	}
}
