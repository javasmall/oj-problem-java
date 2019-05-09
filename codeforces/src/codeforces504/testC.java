package codeforces504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
 * 贪心 数学 排序
 */
public class testC {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		for(int i=0;i<n;i++)
		{
			in.nextToken();int num=(int)in.nval;
			int a[]=new int[num];
			Map<Integer,Integer>map=new HashMap();		
			for(int j=0;j<num;j++)
			{
			  in.nextToken();
			  int q=(int)in.nval;
			  if(map.containsKey(q)) {map.put(q, map.get(q)+1);}
			  else map.put(q, 1);
			}
			int index=0;int a2=0;int b2=0;
			boolean b=false;
			for(int q:map.keySet())
			{
				if(map.get(q)>=4) {a2=q;b2=q;b=true;break;}
				else
					if(map.get(q)>=2) {a[index++]=q;}
				
			}
			if(!b) {
		    Arrays.sort(a,0, index);//0-到index-1排序	    
		    double min=Double.MAX_VALUE;;
			for(int q=0;q<index-1;q++)
			{
				
					double d=(double)a[q]/(double)a[q+1]+(double)a[q+1]/(double)a[q];
					if(d<min) {min=d;a2=a[q];b2=a[q+1];}			
			}
			}
			out.println(a2+" "+a2+" "+b2+" "+b2);
			out.flush();
		}
	}
}
