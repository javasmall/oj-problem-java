package 图论;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class tuopu {
	static class node
	{
		int value;
		List<Integer> next;
		public node(int value) {
			this.value=value;
			next=new ArrayList<Integer>();
		}
		public void setnext(List<Integer>list) {
			this.next=list;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node []nodes=new node[9];//储存节点
		int a[]=new int[9];//储存入度
		List<Integer>list[]=new ArrayList[10];
		for(int i=1;i<9;i++)
		{
			nodes[i]=new node(i);
			list[i]=new ArrayList<Integer>();
		}	
		list[1].add(3);
		nodes[1].setnext(list[1]);
		a[3]++;
		list[2].add(4);list[2].add(6);
		nodes[2].setnext(list[2]);
		a[4]++;a[6]++;
		list[3].add(5);
		nodes[3].setnext(list[3]);
		a[5]++;
		list[4].add(5);list[4].add(6);
		nodes[4].setnext(list[4]);
		a[5]++;a[6]++;
		list[5].add(7);
		nodes[5].setnext(list[5]);
		a[7]++;
		list[6].add(8);
		nodes[6].setnext(list[6]);
		a[8]++;
		list[7].add(8);
		nodes[7].setnext(list[7]);
		a[8]++;
		//主要流程
		//Queue<node>q1=new ArrayDeque<node>();
		Stack<node>s1=new Stack<node>();
		for(int i=1;i<9;i++)
		{
			//System.out.print(nodes[i].next.size()+" 55 ");
			//System.out.println(a[i]);
			if(a[i]==0) {s1.add(nodes[i]);}
			
		}
		while(!s1.isEmpty())
		{
			node n1=s1.pop();//抛出输出
		    
			System.out.print(n1.value+" ");
			
			List<Integer>next=n1.next;
			for(int i=0;i<next.size();i++)
			{
				a[next.get(i)]--;
				if(a[next.get(i)]==0)
				{
					s1.add(nodes[next.get(i)]);
				}
			}
		}
		
		

		
	}

}
