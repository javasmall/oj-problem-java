package test1;

import java.util.Scanner;

public class testD {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int hour=0;int min=0;
		hour=c-a-1;
		min=d-b+60;
		hour+=min/60;
		min%=60;
		System.out.println(hour+" "+min);

	}

}
