package 搜索;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class testCbfs {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Queue<node>q1=new ArrayDeque<node>();
		q1.add(new node(n, 0));
		boolean jud[]=new boolean[200002];
		while(!q1.isEmpty())
		{
			node no=q1.poll();
			int x=no.x;int time=no.time;
			if(no.x==k) {System.out.println(time);break;}
			//else if(x>100001&&x<0) {continue;}
			else {
				if(x+1<=k)if(!jud[x+1]) {
			q1.add(new node(x+1,time+1 ));jud[x+1]=true;}
				if(x-1>=0) if(!jud[x-1]){
			q1.add(new node(x-1, time+1));jud[x-1]=true;}
				if(x*2<=k*2)if(!jud[x*2]) {
			q1.add(new node(x*2, time+1));jud[x*2]=true;}
			}
		}

	}
	static class node
	{
		int x;
		int time;
		public node(int x,int time)
		{
			this.x=x;
			this.time=time;
		}
	}

}
