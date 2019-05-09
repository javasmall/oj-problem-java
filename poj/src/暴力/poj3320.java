package 暴力;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class poj3320 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int p=(int)in.nval;
		int value[]=new int[p];
		Map<Integer, Integer>map=new HashMap<Integer,Integer>();
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<p;i++)
		{
			in.nextToken();
			value[i]=(int)in.nval;
			set.add(value[i]);
		}
		int l=0;int len=p-1;
		map.put(value[0], 1);
		for(int i=1;i<p;i++)
		{
		   if(map.containsKey(value[i])) {map.put(value[i], map.get(value[i])+1);}
		   else map.put(value[i],1);
		   while(map.keySet().size()==set.size()) {
			   if(i-l<=len) {len=i-l;}
			   if(map.get(value[l])>1) {map.put(value[l], map.get(value[l])-1);}
			   else map.remove(value[l]);
			   if(l<i)
			   l++;
			   
		   }
		}
	    out.println(len+1);
		out.flush();
	}

}
