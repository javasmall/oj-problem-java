package 甲;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class pat05 {
	static int a[]=new int[101];
	static int deepth=0;
	@SuppressWarnings({ "unused", "resource", "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int allnumber=sc.nextInt();//总数量
		int parent=sc.nextInt();//母节点
		List<Integer>list=new ArrayList<Integer>();
		Map<Integer,List>map=new HashMap();
		for(int i=0;i<parent;i++)
		{
			int para=sc.nextInt();
			int count=sc.nextInt();
			List<Integer>list1=new ArrayList();
			for(int j=0;j<count;j++)
			{
				int child=sc.nextInt();
				list1.add(child);
			}
			map.put(para, list1);
		}
		int deep=1;
		int node=1;
		dfs(node,deep,map);

		int max=0;//deep两用
		for(int i=0;i<deepth;i++)
		{
			if(a[i]>max) {max=a[i];deep=i;}
		}
		System.out.println(max+" "+deep);
		
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void dfs(int node, int deep, Map<Integer, List> map) {
		List <Integer>list=map.get(node);
		if(list!=null)
		{
			//System.out.println("nn");
			deep++;
			if(deep>deepth) {deepth=deep;}
			a[deep]+=list.size();
			for(int i=0;i<list.size();i++)
			{
				dfs(list.get(i),deep,map);
			}
		}		
	}
}
