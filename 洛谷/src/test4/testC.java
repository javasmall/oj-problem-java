package test4;

import java.util.Scanner;

public class testC {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int qian=0;int ma=0;
		for(int i=0;i<12;i++)
		{
			int a=sc.nextInt();
			qian+=300;
			if(qian<a) {System.out.println(-(i+1));return;}
			else {
				qian-=a;
				ma+=(qian-qian%100);
				qian%=100;
			}
			
		}
		System.out.println((int)(ma*1.2)+qian);//double

	}

}
