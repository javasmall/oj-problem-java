package ͼ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class prim {

	public static void main(String[] args) {
		int minlength=0;//��С�����������·������
		int max=66666;
		String cityname[]= {"����","�人","�Ͼ�","�Ϻ�","����","����","����"};
		int city[][]= {
				{ max, 8, 7, max, max, max, max }, //�������人�Ͼ���ͨ
				{ 8, max,6, max,9, 8,max }, //�人�����������Ͼ������ݡ�����
				{ 7, 6, max, 3,4, max,max }, //�Ͼ������������人���Ϻ�������
				{ max, max,3, max,2, max,max }, //�Ϻ������Ͼ�������
				{ max, 9,4, 2,max, max,10 }, //���ݡ����人���Ͼ����Ϻ�������
				{ max, 8,max, max,max, max,2 }, //���ݡ����人������
				{ max, max,max, max,10,2,max }//���ڡ������ݡ�����
		};// ��ͼ

		boolean istrue[]=new boolean[7];
		//�Ͼ�
		Queue<side>q1=new PriorityQueue<side>(new Comparator<side>() {
			public int compare(side o1, side o2) {
				// TODO Auto-generated method stub
				return o1.lenth-o2.lenth;
			}
		});
		for(int i=0;i<7;i++)
		{
			if(city[2][i]!=max)
			{
				istrue[2]=true;
				q1.add(new side(city[2][i], 2, i));
			}
		}		
		while(!q1.isEmpty())
		{
			side newside=q1.poll();//�׳�
			if(istrue[newside.point1]&&istrue[newside.point2])
			{
				continue;
			}
			else {
				if(!istrue[newside.point1])
				{
					istrue[newside.point1]=true;
					minlength+=city[newside.point1][newside.point2];
					System.out.println(cityname[newside.point1]+" "+cityname[newside.point2]+" ��ͨ");
					for(int i=0;i<7;i++)
					{
						if(!istrue[i])
						{
							q1.add(new side(city[newside.point1][i],newside.point1,i));
						}
					}
				}
				else {
					istrue[newside.point2]=true;
					minlength+=city[newside.point1][newside.point2];
					System.out.println(cityname[newside.point2]+" "+cityname[newside.point1]+" ��ͨ");
					for(int i=0;i<7;i++)
					{
						if(!istrue[i])
						{
							q1.add(new side(city[newside.point2][i],newside.point2,i));
						}
					}
				}
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
