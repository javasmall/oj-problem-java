package 乙;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/*
 * 月饼 贪心算法
 * 快排或者优先队列
 */
public class pat10 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int type=sc.nextInt();//种类
		double allcount=sc.nextDouble();//总共市场需要的吨数
		mooncake cake[]=new mooncake[type];
		for(int i=0;i<type;i++)//输入库存
		{
			cake[i]=new mooncake();
			cake[i].kucun =sc.nextDouble();
		}
		for(int i=0;i<type;i++)//输入value
		{
			cake[i].value =sc.nextDouble();
		}
		Queue<mooncake> q1=new PriorityQueue(compare);
		
		for(int i=0;i<type;i++)//输入value
		{
			q1.add(cake[i]);
		}
		double money=0;
		while(allcount>0&&!q1.isEmpty())
		{
			mooncake team=q1.poll();
			if(team.kucun<=allcount)
			{
				money+=team.value;
				allcount-=team.kucun;
				//System.out.println(money);
			}
			else
			{
				money+=team.value/team.kucun*allcount;
				allcount=0;
			}
		}
		System.out.println(String.format("%.2f", money));
	}
	static Comparator<mooncake> compare=new Comparator<mooncake>() {

		@Override
		
		public int compare(mooncake arg0, mooncake arg1) {
			if((arg0.kucun /arg0.value)-(arg1.kucun/arg1.value)>0)return 1;
			else	return -1;
		}		
	};
	static class mooncake
	{
		double kucun;//库存量
		double value;//总价值
		public mooncake()
		{
			this.kucun=0;
			this.value=0;
		}
		public mooncake(double kucun,double value)
		{
			this.kucun=kucun;
			this.value=value;			
		}
	}
}
