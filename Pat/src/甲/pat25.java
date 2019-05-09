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
/*
 * 需要模拟过程
 */
public class pat25 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;int time=0;
		int a[]=new int[n];int index=0;
		Map<Integer,Integer>map=new HashMap();
		List<String> list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			int x=(int)in.nval;
			a[i]=x;
			if(x==0) {index=i;}
			map.put(x, i);
			if(x!=i&&x!=0) {
				list.add(x+"");
			}			
		}
		while(!list.isEmpty())
		{
			if(index==0) {
				index=map.get(Integer.parseInt(list.get(0)));
				a[0]=a[Integer.parseInt(list.get(0))];
				a[Integer.parseInt(list.get(0))]=0;
				map.put(Integer.parseInt(list.get(0)), 0);
				time++;
			}
			else
			{
				//index     map.get（index）
				int team=map.get(index);
				a[team]=0;//交换对象
				a[index]=team;
				list.remove(index+"");
				index=team;
				///map.put(team, index);
				time++;
				
			}
		}
		out.println(time);
		
		out.flush();
	}
}
