package 甲;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class pat01 {
	static int n;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cmax=sc.nextInt();//最大容量
		 n=sc.nextInt();//总个数
		int sp=sc.nextInt();//问题站
		int m=sc.nextInt();//道路的数量
		
		int bikevalue[]=new int[n+1];//车的数量（在车站）
		int timecost[][]=new int[n+1][n+1];
		boolean bool[]=new boolean[n+1];
		for(int i=1;i<n+1;i++)
		{
			bikevalue[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			int a1=sc.nextInt();
			int a2=sc.nextInt();
			int a3=sc.nextInt();
			timecost[a1][a2]=a3;
			timecost[a2][a1]=a3;
		}
		Queue <node>queue=new PriorityQueue(comepare1);
		ArrayList list=new ArrayList();
		list.add(0);
		queue.add(new node(0,0,0,0,0,list));
		while(!queue.isEmpty())
		{
			//System.out.println(55);
			node no=queue.poll();
			bool[no.value]=true;
			if(no.value==sp) {
				System.out.print(no.neednumber+" ");
				for(int j=0;j<no.list.size();j++)
				{
					if(j==no.list.size()-1) System.out.print(no.list.get(j)+" ");
					else System.out.print(no.list.get(j)+"->");					
				}
				System.out.println(no.backnumber);
				break;
			}
			else	for(int i=0;i<n+1;i++)
			{
				if(timecost[no.value][i]>0&&!bool[i])
				{
					ArrayList list2=(ArrayList) no.list.clone();
					list2.add(i);
					int local=no.localnumber;int need=no.neednumber;int back=no.backnumber;
					if(bikevalue[i]>cmax/2) {//多出
						back+=bikevalue[i]-cmax/2;
						local+=bikevalue[i]-cmax/2;
					}
					else if(bikevalue[i]-cmax/2<0){
						if(local-cmax/2+bikevalue[i]>=0)//不用借
						{
							local=local-cmax/2+bikevalue[i];
							back=local;
						}
						else//需要借
						{
							need+=cmax/2-bikevalue[i]-local;local=0;back=0;
						}
					}
					queue.add(new node(i,no.numbervalue+timecost[no.value][i],need,back,local,list2));					
				}
			}} 
	}
	static Comparator<node> comepare1=new Comparator<node>() {
		public int compare(node o1, node o2) {
			if( o1.numbervalue==o2.numbervalue)
			{
				return o1.neednumber-o2.neednumber;
			}
			else
				return o1.numbervalue-o2.numbervalue;
		}};
	static class node
	  {
		  int value;//当前值
		  ArrayList<Integer> list=new ArrayList();
		  int localnumber;
		  int neednumber;//需要的数量
		  int backnumber;//需要归还的数量
		  int numbervalue;
		  //int path[]=new int[n+1];
		  public node() {}
		  public node(int value,int numbervalue,int neednumber,int backnumber,int localnumber,ArrayList list)
		  {
			  this.value=value;
			  this.numbervalue=numbervalue;
			  //this.path=path;
			  this.neednumber=neednumber;
			  this.backnumber=backnumber;
			  this.localnumber=localnumber;
			  this.list=list;
		  }
	  }
}
