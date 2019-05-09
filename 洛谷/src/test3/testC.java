package test3;

import java.util.Scanner;

public class testC {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2[]=s.split(" ");
		for(int j=s2.length-2;j>=0;j--)
		{
			System.out.print(s2[j]+" ");
		}
		System.out.println();

	}

}
