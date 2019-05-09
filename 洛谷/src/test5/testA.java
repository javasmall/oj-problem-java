package test5;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String aString=sc.nextLine();
		String bString=sc.nextLine();
		aString=aString.toLowerCase();
		bString=bString.toLowerCase();
		int count=0;
		int index=-1;
		index=bString.indexOf(aString);
		String a3[]=bString.split(" ");
		for(int i=0;i<a3.length;i++)
		{
			
			if(a3[i].equals(aString))
				{if(index==-1)index=i;count++;}
		}
		if(count>0) {System.out.println(count+" "+index);}
		else {
			System.out.println(-1);
		}

	}

}
