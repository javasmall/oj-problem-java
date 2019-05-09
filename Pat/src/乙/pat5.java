package 乙;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class pat5 {

	public static void main(String[] args) throws IOException  {
		//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int allcount=(int)in.nval;//总人数
		
		int count=0;//满足条件的人数
		in.nextToken();int last=(int)in.nval;//最低分
		in.nextToken();int well=(int)in.nval;//德才优秀
		student stu[]=new student[allcount];
		Queue<student> c1 = new PriorityQueue<>(cmp1);//德才兼备
		Queue<student> c2 = new PriorityQueue<>(cmp1);//才分不到但德分到线的一类考生属于“德胜才”
		Queue<student> c3 = new PriorityQueue<>(cmp1);//德才分均低于H，但是德分不低于才分的考生属于“才德兼亡”但尚有“德胜才”者
		Queue<student> c4 = new PriorityQueue<>(cmp1);//其他
		for(int i=0;i<allcount;i++)
		{
		   in.nextToken();	int no1=(int)in.nval;
		   in.nextToken();	int no2=(int)in.nval;in.nextToken();	int no3=(int)in.nval;
		   	stu[i]=new student(no1,no2,no3);
		}
		for(int i=0;i<allcount;i++)
		{
		if(stu[i].de>=last&&stu[i].cai>=last)
		 {
			count++;
			if(stu[i].cai>=well&&stu[i].de>=well)
			{c1.add(stu[i]);}
			else if(stu[i].cai>=last&&stu[i].de>=well)
			{c2.add(stu[i]);}
			else if(stu[i].de>=stu[i].cai&&stu[i].cai<well)//注意没有才分高于well，得分低于**的选项
			{c3.add(stu[i]);}
			else
			{c4.add(stu[i]);}//其他状况
		  }
		 }
		out.println(count);
		while(!c1.isEmpty())
		{
			student st=c1.poll();//移除并返回头
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		while(!c2.isEmpty())
		{
			student st=c2.poll();//移除并返回头
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		while(!c3.isEmpty())
		{
			student st=c3.poll();//移除并返回头
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		while(!c4.isEmpty())
		{
			student st=c4.poll();//移除并返回头
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		out.flush();
	}
	static Comparator<student>cmp1=new Comparator<student>()
			{			
				public int compare(student a, student b) {
					if(a.de+a.cai==b.cai+b.de)//如果总分相同
					{
						if(a.de==b.de)
						{
							return a.number-b.number;//按照学号升序
						}
						else
						{return b.de-a.de;}//返回大根堆
					}
					else
						return (int)(b.cai+b.de-a.de-a.cai);//返回大根堆
				}		
			};
	static class student
	{
		int number;
		int de;
		int cai;
		public student(int number,int de,int cai)
		{
			this.number=number;
			this.de=de;
			this.cai=cai;
		}
	}
}
