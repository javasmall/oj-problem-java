package test““;

import java.util.Scanner;

public class p1001 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int time=0;
		while(n!=1)
		{
			if(n%2==0) {n/=2;time++;}
			else {n=(n*3+1)/2;time++;}
		}
		System.out.println(time);
	}

}
