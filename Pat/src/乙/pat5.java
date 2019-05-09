package ��;


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
		in.nextToken();int allcount=(int)in.nval;//������
		
		int count=0;//��������������
		in.nextToken();int last=(int)in.nval;//��ͷ�
		in.nextToken();int well=(int)in.nval;//�²�����
		student stu[]=new student[allcount];
		Queue<student> c1 = new PriorityQueue<>(cmp1);//�²ż汸
		Queue<student> c2 = new PriorityQueue<>(cmp1);//�ŷֲ������·ֵ��ߵ�һ�࿼�����ڡ���ʤ�š�
		Queue<student> c3 = new PriorityQueue<>(cmp1);//�²ŷ־�����H�����ǵ·ֲ����ڲŷֵĿ������ڡ��ŵ¼����������С���ʤ�š���
		Queue<student> c4 = new PriorityQueue<>(cmp1);//����
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
			else if(stu[i].de>=stu[i].cai&&stu[i].cai<well)//ע��û�вŷָ���well���÷ֵ���**��ѡ��
			{c3.add(stu[i]);}
			else
			{c4.add(stu[i]);}//����״��
		  }
		 }
		out.println(count);
		while(!c1.isEmpty())
		{
			student st=c1.poll();//�Ƴ�������ͷ
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		while(!c2.isEmpty())
		{
			student st=c2.poll();//�Ƴ�������ͷ
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		while(!c3.isEmpty())
		{
			student st=c3.poll();//�Ƴ�������ͷ
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		while(!c4.isEmpty())
		{
			student st=c4.poll();//�Ƴ�������ͷ
			out.println(st.number+" "+st.de+" "+st.cai);
		}
		out.flush();
	}
	static Comparator<student>cmp1=new Comparator<student>()
			{			
				public int compare(student a, student b) {
					if(a.de+a.cai==b.cai+b.de)//����ܷ���ͬ
					{
						if(a.de==b.de)
						{
							return a.number-b.number;//����ѧ������
						}
						else
						{return b.de-a.de;}//���ش����
					}
					else
						return (int)(b.cai+b.de-a.de-a.cai);//���ش����
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
