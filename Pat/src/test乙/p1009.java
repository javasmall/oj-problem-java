package test��;

import java.util.Scanner;

public class p1009 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String te[]=str.split(" ");
		for(int i=te.length-1;i>=0;i--)
		{
			System.out.print(te[i]+(i==0?"":" "));
		}
		System.out.println();

	}

}
