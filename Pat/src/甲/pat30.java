package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pat30 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		Map<Integer,Integer> map=new HashMap();
		List<Integer> list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			int qq=(int)in.nval;
			list.add(qq);
			if(map.containsKey(qq)) {map.put(qq, map.get(qq)+1);}
			else
				map.put(qq, 1);
		}
		int i;
		for( i=0;i<list.size();i++)
		{
			if(map.get(list.get(i))==1)
			{
				out.println(list.get(i));break;
			}
		}
		if(i==list.size()) {out.println("None");}
		out.flush();

	}

}
