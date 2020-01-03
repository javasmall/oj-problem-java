package ͼ��;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import ͼ��.prim.side;
/*
 * ���ߣ�bigsai(���ں�)
 */
public class kruskal {

	static int tree[]=new int[10];//bing�鼯
	public static void init() {
		for(int i=0;i<10;i++)//��ʼ
		{
			tree[i]=-1;
		}
	}
	public static int search(int a)//����ͷ�ڵ����ֵ
	{
		if(tree[a]>0)//˵�����ӽڵ�
		{
			return tree[a]=search(tree[a]);//·��ѹ��
		}
		else
			return a;
	}
	public static void union(int a,int b)//��ʾ a��b���ڵ����ϲ�С���ϲ�����(����Ҫ)
	{
		int a1=search(a);//a��
		int b1=search(b);//b��
		if(a1==b1) {//System.out.println(a+"��"+b+"�Ѿ���һ������");
		}
		else {
		if(tree[a1]<tree[b1])//����Ǹ�����Ϊ�˼򵥼��ټ��㣬���ڵ���value����
		{
			tree[a1]+=tree[b1];//�������  ע���Ǹ������
			tree[b1]=a1;       //b����Ϊa��������ֱ��ָ��a��
		}
		else
		{
			tree[b1]+=tree[a1];//�������  ע���Ǹ������
			tree[a1]=b1;       //b����Ϊa��������ֱ��ָ��a��
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		int minlength=0;//��С�����������·������
		int max=66666;
		String cityname[]= {"����","�人","�Ͼ�","�Ϻ�","����","����","����"};
		boolean jud[][]=new boolean[7][7];//�������Ҫ��ֹ�ظ� ���� ba��ab�ȼ۵�
		int city[][]= {
				{ max, 8, 7, max, max, max, max }, 
				{ 8, max,6, max,9, 8,max }, 
				{ 7, 6, max, 3,4, max,max }, 
				{ max, max,3, max,2, max,max }, 
				{ max, 9,4, 2,max, max,10 }, 
				{ max, 8,max, max,max, max,2 }, 
				{ max, max,max, max,10,2,max }
		};// ��ͼ
		boolean istrue[]=new boolean[7];
		//�Ͼ�
		Queue<side>q1=new PriorityQueue<side>(new Comparator<side>() {//���ȶ��д��+
			public int compare(side o1, side o2) {
				// TODO Auto-generated method stub
				return o1.lenth-o2.lenth;
			}
		});
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(!jud[i][j]&&city[i][j]!=max)//�Ƿ�������
				{
					jud[i][j]=true;jud[j][i]=true;
					q1.add(new side(city[i][j], i, j));
				}
			}
		}
		while(!q1.isEmpty())//ִ���㷨
		{
			side newside=q1.poll();
			int p1=newside.point1;
			int p2=newside.point2;
			if(search(p1)!=search(p2))
			{
				union(p1, p2);
				System.out.println(cityname[p1]+" "+cityname[p2]+" ��ͨ");
				minlength+=newside.lenth;
			}
		}
		System.out.println(minlength);
		

	}
	static class side//��
	{
		int lenth;
		int point1;
		int point2;
		public side(int lenth,int p1,int p2) {
			this.lenth=lenth;
			this.point1=p1;
			this.point2=p2;
		}
	}
}
