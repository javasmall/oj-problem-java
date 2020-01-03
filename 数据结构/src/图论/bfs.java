package 图论;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class bfs {
	public static void main(String[] args) {
		List<Integer> map[]=new ArrayList[7];
		boolean isVisit[]=new boolean[7];
		for(int i=0;i<map.length;i++)//初始化
		{
			map[i]=new ArrayList<Integer>();
		}
		map[0].add(1);map[0].add(2);map[0].add(3);
		map[1].add(0);map[1].add(4);map[1].add(5);
		map[2].add(0);map[2].add(6);
		map[3].add(0);map[3].add(6);
		map[4].add(1);
		map[5].add(1);
		map[6].add(2);map[6].add(3);
		
		Queue<Integer>q1=new ArrayDeque<Integer>();
		q1.add(0);isVisit[0]=true;
		while (!q1.isEmpty()) {
			int va=q1.poll();
			System.out.println("访问"+(va+1));
			for(int i=0;i<map[va].size();i++)
			{
				int index=map[va].get(i);
				if(!isVisit[index])
				{
					q1.add(index);
					isVisit[index]=true;
				}
			}
		}
	}
}
