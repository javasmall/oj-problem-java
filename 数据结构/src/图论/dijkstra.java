package ͼ��;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class dijkstra {
	static class node
	{
		int x; //�ڵ���
		int lenth;//����
		public node(int x,int lenth) {
			this.x=x;
			this.lenth=lenth;
		}
	}

	public static void main(String[] args) {
		int[][] map = new int[6][6];//��¼Ȩֵ��˳���¼������������Կ��Ǹ����ڽӱ�
		initmap(map);//��ʼ��
		boolean bool[]=new boolean[6];//�ж��Ƿ��Ѿ�ȷ��
		int len[]=new int[6];//����
		for(int i=0;i<6;i++)
		{
			len[i]=Integer.MAX_VALUE;
		}
		Queue<node>q1=new PriorityQueue<node>(com);
		len[0]=0;//��0����㿪ʼ
		q1.add(new node(0, 0));
		int count=0;//����ִ���˼���dijkstra
		while (!q1.isEmpty()) {
			node t1=q1.poll();
			int index=t1.x;//�ڵ���
			int length=t1.lenth;//�ڵ㵱ǰ�����
			bool[index]=true;//�׳��ĵ�ȷ��
			count++;//��ʵִ����6�ξͿ���ȷ���Ͳ���Ҫ����ִ����  �����п��ޣ����˼��ټ������
			for(int i=0;i<map[index].length;i++)
			{
				if(map[index][i]>0&&!bool[i])
				{
					node node=new node(i, length+map[index][i]);
					if(len[i]>node.lenth)//��Ҫ���½ڵ��ʱ����½ڵ㲢�������
					{
						len[i]=node.lenth;
						q1.add(node);
					}
				}
			}
		}		
		for(int i=0;i<6;i++)
		{
			System.out.println(len[i]);
		}
	}
	static Comparator<node>com=new Comparator<node>() {

		public int compare(node o1, node o2) {
			// TODO Auto-generated method stub
			return o1.lenth-o2.lenth;
		}
	};

	private static void initmap(int[][] map) {
		map[0][1]=2;map[0][2]=3;map[0][3]=6;
		map[1][0]=2;map[1][4]=4;map[1][5]=6;
		map[2][0]=3;map[2][3]=2;
		map[3][0]=6;map[3][2]=2;map[3][4]=1;map[3][5]=3;
		map[4][1]=4;map[4][3]=1;
		map[5][1]=6;map[5][3]=3;	
	}
}
