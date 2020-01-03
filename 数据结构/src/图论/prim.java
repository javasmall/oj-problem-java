package 图论;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class prim {

	public static void main(String[] args) {
		int minlength=0;//最小生成树的最短路径长度
		int max=66666;
		String cityname[]= {"北京","武汉","南京","上海","杭州","广州","深圳"};
		int city[][]= {
				{ max, 8, 7, max, max, max, max }, //北京和武汉南京联通
				{ 8, max,6, max,9, 8,max }, //武汉——北京、南京、杭州、广州
				{ 7, 6, max, 3,4, max,max }, //南京——北京、武汉、上海、杭州
				{ max, max,3, max,2, max,max }, //上海——南京、杭州
				{ max, 9,4, 2,max, max,10 }, //杭州——武汉、南京、上海、深圳
				{ max, 8,max, max,max, max,2 }, //广州——武汉、深圳
				{ max, max,max, max,10,2,max }//深圳——杭州、广州
		};// 地图

		boolean istrue[]=new boolean[7];
		//南京
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
			side newside=q1.poll();//抛出
			if(istrue[newside.point1]&&istrue[newside.point2])
			{
				continue;
			}
			else {
				if(!istrue[newside.point1])
				{
					istrue[newside.point1]=true;
					minlength+=city[newside.point1][newside.point2];
					System.out.println(cityname[newside.point1]+" "+cityname[newside.point2]+" 联通");
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
					System.out.println(cityname[newside.point2]+" "+cityname[newside.point1]+" 联通");
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
	
	static class side//边
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
