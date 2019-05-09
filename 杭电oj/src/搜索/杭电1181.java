package 搜索;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class 杭电1181 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);		
		Map<String, Set<String>>map=new HashMap<>();
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			if(s.equals("0"))
			{
				Queue<String> q1=new ArrayDeque<>();
				if(!map.containsKey("b")) {System.out.println("No.");}
				else
				{
					Set<String> jud=new HashSet<>();
					q1.add("b");jud.add("b");
					boolean j=false;
					while(!q1.isEmpty())
					{
						String node=q1.poll();
						if(node.equals("m"))
						{
							System.out.println("Yes.");
							j=true;
							break;
						}
						else
						{
							if(map.containsKey(node))
							{
							Set<String> set2=map.get(node);
							for(String team:set2)
							{
								
								if(jud.contains(team)) {continue;}
								else
								{
									jud.add(team);
									q1.add(team);
								}
							}
							}
						}
					}
					if(!j) {System.out.println("No.");}
				}

				map.clear();
			}
			String start=s.substring(0, 1);
			String end=s.substring(s.length()-1);
			if(map.containsKey(start)) 
			{Set<String> set2=map.get(start);set2.add(end); map.put(start, set2);}
			else {
				Set<String> set=new HashSet<>();
				set.add(end);map.put(start, set);
			}
		}	
	}
}
