package ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class pat08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String node=sc.next();
		int number=sc.nextInt();//����
		Map<String,Integer>map=new HashMap<String, Integer>();//��ַ������
		Map<String,String>map2=new HashMap<String,String>();//�¸���ַ
		for(int i=0;i<number;i++)
		{
			String adress=sc.next();//��ַ
			int key=sc.nextInt();
			String next=sc.next();
			map.put(adress, key);
			map2.put(adress, next);
		}
		List<String> list=new ArrayList();//����������
		List<String> list2=new ArrayList();
		Set set=new HashSet();
		String team=node;
		while(!node.equals("-1"))
		{
			if(!set.contains(Math.abs(map.get(node)))) {
			list.add(node);
			set.add(Math.abs(map.get(node)));
			}
			else {
				list2.add(node);}
			node=map2.get(node);
		}
		for(int i=0;i<list.size();i++)
		{			
			if(i!=list.size()-1)
			{
				System.out.println(list.get(i)+" "+map.get(list.get(i))+" "+list.get(i+1));
			}
			else
			{
				System.out.println(list.get(i)+" "+map.get(list.get(i))+" "+"-1");
			}
		}
		for(int i=0;i<list2.size();i++)
		{			
			if(i!=list2.size()-1)
			{
				System.out.println(list2.get(i)+" "+map.get(list2.get(i))+" "+list2.get(i+1));
			}
			else
			{
				System.out.println(list2.get(i)+" "+map.get(list2.get(i))+" "+"-1");
			}
		}
	}
	
}
