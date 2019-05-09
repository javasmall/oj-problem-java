package codeforces496;

import java.util.Scanner;

public class testB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a1=sc.next();
		String a2=sc.next();
		int min=a1.length()<a2.length()?a1.length():a2.length();
		for(int i=0;i<min;i++)
		{
			  
			 if(a1.charAt(a1.length()-1-i)!=a2.charAt(a2.length()-1-i))
				{
					a1=a1.substring(0,a1.length()-i);
					a2=a2.substring(0, a2.length()-i);
					System.out.println(a1.length()+a2.length());
					break;
				}
			 if(i==min-1) {	System.out.println((a1.length()>a2.length()?a1.length():a2.length())-min);}
		  
		}
	}
}
