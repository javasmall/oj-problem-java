package ËÑË÷;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class poj1979 {

	static int x[]= {-1,0,1,0};
	static int y[]= {0,1,0,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 while (sc.hasNext()) {
		 int w=sc.nextInt();
		 int h=sc.nextInt();
		 if(w==0&&h==0)break;
		 char map[][]=new char[h][w];
		 boolean jud[][]=new boolean[h][w];
		 int x1=0,y1=0;
		 for(int i=0;i<h;i++)
		 {
			 map[i]=sc.next().toCharArray();
			 for(int j=0;j<w;j++)
			 {
				 if(map[i][j]=='@')
				 {
					 x1=i;y1=j;//
				 }
			 }
		 }
		 Queue<node>q1=new ArrayDeque<node>();
		 q1.add(new node(x1, y1));
		 int num=1;
		 while(!q1.isEmpty())
		 {
			 node te=q1.poll();
			 int xt=te.x;int yt=te.y;
			 for(int j=0;j<4;j++)
			 {
				 if(xt+x[j]>=0&&xt+x[j]<h&&yt+y[j]>=0&&yt+y[j]<w)
				 {
					 if(map[xt+x[j]][yt+y[j]]=='.'&&!jud[xt+x[j]][yt+y[j]])
					 {
						 jud[xt+x[j]][yt+y[j]]=true;
						 q1.add(new node(xt+x[j],yt+y[j]));
						 num++;
					 }
				 }
			 }
			 
		 }
		 System.out.println(num);
		 		
	}

	}
	static class node
	{
		int x;
		int y;
		public node(int x,int y) {
			// TODO Auto-generated constructor stub
			this.x=x;
			this.y=y;
		}
	}

}