package codeforces479;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class testB {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		in.nextToken();
		String s=in.sval;
		Map<String,Integer>map=new HashMap();
		for(int i=0;i<s.length()-1;i++)
		{
			if(map.containsKey(s.substring(i, i+2))) {map.put(s.substring(i, i+2),map.get(s.substring(i,i+2))+1);}
			else map.put(s.substring(i, i+2),1);
		}
		int max=0;String svalue="";
		for(String s1:map.keySet())
		{
			if(map.get(s1)>max) {max=map.get(s1);svalue=s1;}
		}
		out.println(svalue);out.flush();
	}
}
