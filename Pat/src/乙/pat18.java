package ��;

import java.util.Scanner;

public class pat18 {

	
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//�ܹ�������
		int heli=0;//����ĸ���
		 person old=new person();//��
		 person yong=new person();//С
		person p[]=new person[n];//���������
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			String date=sc.next();
			String date2[]=date.split("/");
			person exam=new person(name,date2[0],date2[1],date2[2]);
			if(check(exam)) {
				heli++;
			if(heli==1)
			{				
				clone(old,exam);
				clone(yong,exam);
			}
			else
				comepare(exam,old,yong);	//�Ƚ���		
			}
		}
		System.out.println(heli+" "+old.name+" "+yong.name);		
	}
	private static void clone(person a, person b) {//�����¡��Ҳ����д�����Ա�����̳�cloneable�ӿ�
		a.name=b.name;
		a.year=b.year;
		a.month=b.month;
		a.day=b.month;
		
	}
	private static boolean check(person exam) {//�ж��Ƿ�Ϸ�
		int year=Integer.parseInt(exam.year);
		int month=Integer.parseInt(exam.month);
		int day=Integer.parseInt(exam.day);
		//System.out.println(year+" "+month+" "+day);
		if(year<1814||year>2014) {return false;}
		else if(year==1814) {
			if(month<9)return false;
			else if(month==9&&day<6)return false;
		}
		 if(year==2014) {
			if(month>9) {return false;}
			if(month==9&&day>6) {return false;}
		}
		return true;
		
	}
	private static void comepare(person exam, person old, person yong) {
		int year=Integer.parseInt(exam.year);
		int month=Integer.parseInt(exam.month);
		int day=Integer.parseInt(exam.day);
		
		int year1=Integer.parseInt(old.year);
		int month1=Integer.parseInt(old.month);
		int day1=Integer.parseInt(old.day);
		
		int year2=Integer.parseInt(yong.year);
		int month2=Integer.parseInt(yong.month);
		int day2=Integer.parseInt(yong.day);
		
		if(year>=year2) {//�Ҹ������
			if(year>year2) {clone(yong,exam);}
			else
			{
				if(month>month2) {clone(yong,exam);}
				else
					{if(day>day2) {clone(yong,exam);}}
			}
		}	
		if(year<=year1) {//�Ҹ��ϵ�			
			if(year<year1) {clone(old,exam);}
			else
			{
				if(month<month1) {clone(old,exam);}
				else
					{if(day<=day1) {clone(old,exam);}}
			}
		}					
	}
	static class person
	{
		public String name;
    	public	String year;
	    public	String month;
		public String day;
		public person() {}
		public person(String name,String year,String month,String day)
		{
			this.name=name;
			this.year=year;
			this.month=month;
			this.day=day;
		}		
	}
}
