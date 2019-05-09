package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class pat21 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int n=(int)in.nval;
		Map<Integer, Integer>map[]=new HashMap[n];
		for(int i=0;i<n;i++)
		{
			map[i]= new HashMap<Integer,Integer>();
			in.nextToken();int number=(int)in.nval;
			for(int j=0;j<number;j++)
			{
				in.nextToken();int team=(int)in.nval;
				if(map[i].containsKey(team)) {map[i].put(team, map[i].get(team)+1);}
				else map[i].put(team, 1);
			}
		}
		in.nextToken();int k=(int)in.nval;//执行查询
		for(int i=0;i<k;i++)
		{
			in.nextToken();int a1=(int)in.nval-1;
			in.nextToken();int a2=(int)in.nval-1;
			int same=0,allcount=0;
			for(int a:map[a1].keySet())
			{
				if(map[a2].containsKey(a))
				{
					same+=1;allcount+=1;
				}
				else
				{
					allcount+=1;
				}
			}	
			for(int a:map[a2].keySet())
			{
				if(map[a1].containsKey(a))
				{
					
				}
				else
				{
					allcount+=1;
				}
			}	
			
			double value=(double)same/allcount;
		
			out.println(String.format("%.1f", value*100)+"%");
		}
		out.flush();
	}
}
