package test乙;

import java.util.Scanner;
//福尔摩斯的约会
public class p1014 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		String s4=sc.next();
		//找第一个相同
        char first='A';
        char last='A';
		int time=0;//记录次数
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				time++;
				
				String s11=s1;
				if(time==1) {
					first=s11.charAt(i);//统一转换成大写再传值
				    if(first<'A'||first>'G') {time--;}//第一个不能是数字
				}
				else if(time==2) 
				{ last=s11.charAt(i);
				if((last>='A'&&last<='N')||(last>='0'&&last<='9'))break;else time--;}
				
			}
		}
		int week=first-'A'+1;//获得星期的编号
		int hour=0;
		if(last>='A')hour=last-'A'+10; 
		else hour=last-'0';
		//System.out.println(week+"  "+hour+"   "+first);//测试
		int second=0;
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)==s4.charAt(i))
			{
				String s33=s3.toUpperCase();
				if(s33.charAt(i)>='A'&&s33.charAt(i)<='Z')
				{
					second=i;break;
				}
				else
					continue;
			}
		}
	//	System.out.println(week+" "+hour+" "+second);
		String getweek=getweek(week);
		String gethour=gethour(hour);
		String getsecond=getsecond(second);
		System.out.println(getweek+" "+gethour+":"+getsecond);
		
	}

	private static String getsecond(int second) {
		if(second<10)return 0+""+second;
		else
		return second+"";
	}
	private static String gethour(int a) {
		if(a<10)
			return 0+""+a;
		else
		return a+"";
	}

	private static String getweek(int week) {
		String wk = "";
		switch(week)
		{
		case 1:wk="MON";break;
		case 2:wk="TUE";break;
		case 3:wk="WED";break;
		case 4:wk="THU";break;
		case 5:wk="FRI";break;
		case 6:wk="SAT";break;
		case 7:wk="SUN";break;
		
		}
		return wk;
	}
}