package test2;

import java.util.Scanner;

public class testD {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		//long value=0;
		int day=sc.nextInt();//星期几
		int n=sc.nextInt();//j
		int count=0;
		int count2=n/7;
		count+=count2*1250;
		int count3=n%7;
		for(int i=0;i<count3;i++)
		{
			if(day%7==0||day%7==6)
			{}
			else
			{
				count+=250;
			}
			//System.out.println(count+" "+i);
			day++;
			
		}
		System.out.println(count);

	}

}
