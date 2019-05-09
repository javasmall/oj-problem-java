package test4;

import java.util.Scanner;

public class testB {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int bu=0;int day=-1;
		for(int i=0;i<7;i++)
		{
			int a=sc.nextInt();int b=sc.nextInt();
			if(a+b>8) {
				if(a+b>bu) {day=i;bu=a+b;}
			}
		}
		System.out.println(day+1);

	}

}
