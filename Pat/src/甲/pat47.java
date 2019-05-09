package ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class pat47 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		double cmax=in.nval;//�������
		in.nextToken();double distance=in.nval;//����
		in.nextToken();double ave=in.nval;//ÿһ�������ܵľ���
		in.nextToken();int n=(int)in.nval;//����
		Map <Double,Double>map=new TreeMap();
		map.put(distance, Double.MAX_VALUE);
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			double price=in.nval;//price
			in.nextToken();
			double length=in.nval;//����	
			if(length<distance) {
			if(map.containsKey(length)) {map.put(length, price<=map.get(length)?price:map.get(length));}
			else map.put(length, price);}
		}
		
		boolean b=false;
		double index=0;//��ǰ���� 
		double oilnumber=0;
		double money=0;
		Queue<oil>q1=new PriorityQueue(cmp);//��������ת����
		Queue<oil>q2=new PriorityQueue(cmp);
		for(double k:map.keySet())
		{
			//if(k>=distance) {k=distance;}
			if(oilnumber*ave<(k-index)) {b=true;index+=oilnumber*ave;break;}//�ܵ�����
			else
			{
				
				double length=0;
				while(length<k-index)
				{
					oil exam=q1.poll();
					if((length+exam.price*exam.value)>(k-index))//�ܹ��������
					{
						
						oilnumber-=(k-index-length)/ave;
						exam.value-=(k-index-length)/ave;
						money+=(k-index-length)/ave*exam.price;
						length=k-index;
						q1.add(exam);
					}
					else//�ܲ���
					{
						money+=exam.value*exam.price;
						oilnumber-=exam.value;
						length+=exam.value*ave;
					}
				}
				index=k;
				//��ʼ���͹���//��̭����
				if(k<distance) {
				oilnumber=0.0;
				while(!q1.isEmpty())
				{
					oil exam=q1.poll();//out.println(exam.price+" "+exam.value);
					if(exam.price-map.get(k)<0) {q2.add(exam);oilnumber+=exam.value;}
					else//ֻ��ȡ�����˵���
					break;
				}
				//out.println();
				q1.clear();
				while(!q2.isEmpty())
				{
					q1.add(q2.poll());
				}
				
				q1.add(new oil(map.get(k),cmax-oilnumber));
				oilnumber=cmax;								
			}
			else if(k>=distance) {break;}
					
			}
			//out.println(" "+k+" "+map.get(k)+" "+money);
		}
		if(index==distance)
		out.println(String.format("%.2f", money));
		else
			out.println("The maximum travel distance = "+String.format("%.2f", index));
		out.flush();

	}
public	static Comparator<oil>cmp=new Comparator<oil>() {
	@Override
	public int compare(oil o1, oil o2) {		
		return (o1.price-o2.price)>0?1:-1;
	}				
	};
public	static class oil
	{
	public	double price;//�۸�
	public	double value;//����
		public oil() {
		}
		public oil(double price,double value)
		{
			this.price=price;
			this.value=value;
		}
	}
}
