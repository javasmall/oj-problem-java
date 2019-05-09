package test乙;

import java.util.Scanner;

public class p1006 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int bai=n/100;
		int shi=(n%100)/10;
		int shu=n%10;
		String s="";
		for(int i=0;i<bai;i++)
		{
			s+="B";
		}
		for(int i=0;i<shi;i++)
		{
			s+="S";
		}
		for(int i=0;i<shu;i++)
		{
			s+=(i+1);
		}
		System.out.println(s);

	}

}
