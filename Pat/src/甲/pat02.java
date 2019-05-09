package 甲;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class pat02 {
	static int allcan=0;//所有能过
	static int happy=0;
	static int mincost=Integer.MAX_VALUE;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> map1=new HashMap();
		Map<Integer,String> map2=new HashMap();
		int a=sc.nextInt();//城市数
		int b=sc.nextInt();//马路数量
		String from=sc.next();//初始地
        int happ[]=new int [a];//记录happy值
		map1.put(from, 0);//根据中文找字母
		map2.put(0, from);//根据字母找英文
		int bool[][]=new int[a][a];//计算长度
		for(int i=1;i<a;i++)
		{
			String name=sc.next();
			int happy1=sc.nextInt();
			happ[i]=happy1;
			map1.put(name, i);
			map2.put(i, name);
		}
		for(int i=0;i<b;i++)
		{
			String name1=sc.next();
			String name2=sc.next();
			int mapget=sc.nextInt();
			bool[map1.get(name1)][map1.get(name2)]=mapget;//城市联通花费
			bool[map1.get(name2)][map1.get(name1)]=mapget;
		}		
		int last=map1.get("ROM");//截至地址
		int judgel[]=new int [a];//记录点的cost花费
		for(int i=0;i<a;i++)
		{
			judgel[i]=Integer.MAX_VALUE;
		}
		List list=new ArrayList();
		Queue<place> q1=new PriorityQueue(compare);
		place first=new place(0,0,0,0);
		place finalplace=new place(0,0,0,0);//最终的解
		q1.add(first);
		//list.add(first);
		while(!q1.isEmpty())
		{
			place p1=q1.poll();

			list.add(p1.name);
			if(p1.name==last) {				
				if(mincost>p1.cost) {allcan=1;mincost=p1.cost;happy=p1.happy;finalplace=p1;}
				else if(mincost==p1.cost)
				{allcan++;if(happy<p1.happy) {finalplace=p1;happy=p1.happy;}
				else if(happy==p1.happy) {if(finalplace.number>p1.number)finalplace=p1;}}
				}
			else if(p1.cost>mincost) {}
			else
			for(int i=0;i<a;i++)
			{
				if(bool[p1.name][i]>0&&!list.contains(i))//这个点还未被确定
				{
					int teamp[]=p1.allname.clone();
					teamp[p1.number+1]=i;
					q1.add(new place(i,p1.cost+bool[p1.name][i],p1.happy+happ[i],p1.number+1,teamp));
					if(judgel[i]>p1.cost+bool[p1.name][i])
					{
						judgel[i]=p1.cost+bool[p1.name][i];
					}
				}
			}
			
		}
		System.out.println(allcan+" "+ mincost+" "+happy+" "+happy/(finalplace.number));	
		int teamp[]=finalplace.allname;
		for(int i=0;i<finalplace.number+1;i++)
		{
			if(i==finalplace.number) {System.out.print(map2.get(teamp[i]));}
			else  System.out.print(map2.get(teamp[i])+"->");
		}
		
	}
	static Comparator<place> compare=new Comparator<place>()
			{
				@Override
				public int compare(place o1, place o2)
				{					
					return  (o1.cost-o2.cost);
				}	
			};
	static class place
	{
		int name;//对应的数字
		int cost;//花费
		int happy;//满意度
		int number;//走过的数量
		int allname[]=new int[202];//用于记录走过路径，使用时候和number配合使用
		public place()
		{		}
		public place(int name)
		{
			this.name=name;
		}
		public place(int name,int cost,int happy,int number)
		{
			this.name=name;this.cost=cost;this.happy=happy;this.number=number;
		}
		public place(int name,int cost,int happy,int number,int allname[])
		{
			this.name=name;this.cost=cost;this.happy=happy;this.number=number;this.allname=allname;
		}
	}
}	