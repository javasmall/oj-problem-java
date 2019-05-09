package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Map;
import java.util.TreeMap;

public class pat37 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
	    in.nextToken();	int value=(int)in.nval;
		Map<Integer,Integer>map=new TreeMap();
		for(int i=0;i<n;i++)
		{
			in.nextToken();int team=(int)in.nval;
			if(map.containsKey(team)) {map.put(team, map.get(team)+1);}
			else
				map.put(team, 1);
		}
		boolean b=false;
		for(int i:map.keySet())
		{
			if(map.containsKey(value-i))
			{
				if(value-i==i&&map.get(i)>1) {out.println(i+" "+i);b=true;break;}
				else  if(value-i!=i) {out.println(i+" "+(value-i));b=true;break;}
			}
		}
		if(!b) {out.println("No Solution");}
		out.flush();
	}

}
