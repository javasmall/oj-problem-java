package test2;

import java.util.Scanner;

public class testC {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double a=2.0;
		double value=0.0;
		for(int i=0;i<10000;i++)
		{		
			{
				value+=a;
				a*=0.98;
			}
			if(value>x) {System.out.println(i);break;}
		}

	}

}
