package 甲;

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

public class pat41 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s[]=in.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		String index=s[1];
		Map<Integer,String>map=new HashMap();
		Map<String,Integer>map2=new HashMap();
		Map<String,String>map3=new HashMap();
		List<Integer>list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			s=in.readLine().split(" ");
			String adress=s[0];
			int value=Integer.parseInt(s[1]);
			String next=s[2];
			map.put(value, adress);
			map2.put(adress, value);
			map3.put(adress, next);			
		}
		while(!index.equals("-1"))
		{
			list.add(map2.get(index));
			index=map3.get(index);	
		}
		list.sort(null);
		
		out.println(list.size()+" "+(list.size()>0?map.get(list.get(0)):"-1"));
		for(int i=0;i<list.size();i++)
		{
			if(i==list.size()-1)
			{
				out.println(map.get(list.get(i))+" "+list.get(i)+" -1");
			}
			else
			{
				out.println(map.get(list.get(i))+" "+list.get(i)+" "+map.get(list.get(i+1)));
			}
		}
		
		out.flush();
	}
}
