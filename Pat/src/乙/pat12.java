package ��;

import java.util.Scanner;
/*
 * ����ת��
 */
public class pat12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		String e="";
		int d=sc.nextInt();//d����
		while(c!=0)
		{
			int team=c%d;
			c=c/d;
			e=team+e;
		}
		System.out.println(e);

	}
}
