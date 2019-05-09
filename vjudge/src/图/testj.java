package 图;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class testj {
	public static void main(String [] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int a[][]=new int[5][5];
		boolean b[][]=new boolean[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				in.nextToken();
				a[i][j]=(int)in.nval;
			}
		}
		List<point>li=new ArrayList<point>();li.add(new point(0, 0));
		node no=new node(0,0,li) ;
		Queue<node>q1=new ArrayDeque<node>();
		q1.add(no);
		while(!q1.isEmpty())
		{
			//System.out.println(q1.size());
			node node1=q1.poll();
			int x=node1.x;
			int y=node1.y;
			//for(int i=0;i<node1.list.size();i++)
			//{out.print(node1.list.get(i).x+""+node1.list.get(i).y+"  :");}
			//out.println();
			//out.println(node1.x+" "+node1.y);
			if(node1.x==4&&node1.y==4) {
				for(int i=0;i<node1.list.size();i++)
				{
					out.println("("+node1.list.get(i).x+", "+node1.list.get(i).y+")");
				}
				//out.println("("+node1.x+","+node1.y+")");
				break;
			}
			else
			{
				if(node1.x<4)//上下方向
				{
					if(a[node1.x+1][node1.y]==0&&!b[node1.x+1][node1.y])
					{
						List<point>list2=new ArrayList<point>();
						for(int j=0;j<node1.list.size();j++)
						{
							point team=new point(node1.list.get(j).x, node1.list.get(j).y);
							list2.add(team);
						}
						list2.add(new point(x+1, y));
						
						q1.add(new node((node1.x+1),node1.y,list2));
						b[node1.x+1][node1.y]=true;
					}
				}
				if(node1.y<4)//上下方向
				{
					if(a[node1.x][node1.y+1]==0&&!b[node1.x][node1.y+1])
					{
						List<point>list3=new ArrayList<point>();
						for(int j=0;j<node1.list.size();j++)
						{
							point team=new point(node1.list.get(j).x, node1.list.get(j).y);
							list3.add(team);
						}
						list3.add(new point(x, y+1));
						q1.add(new node(x,y+1,list3));
						b[node1.x][node1.y+1]=true;
					}
				}
			}
		}	out.flush();	
	}
static class node{
	int x;
	int y;
	List<point>list;
	public node() {};
	public node(int x,int y,List<point>list)
	{
		this.x=x;
		this.y=y;
		this.list=list;
	}
}
static class point
{
	int x;
	int y;
	public point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
}
