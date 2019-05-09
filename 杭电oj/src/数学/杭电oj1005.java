package ÊýÑ§;

import java.util.Scanner;

public class º¼µçoj1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			if(a == 0 && b == 0 && n == 0)
				break;
			if(n > 51)
				n = n % 49;
			System.out.println(function(a,b,n));
		}
	}
	
	private static  int function(int a,int b,int n){
		if(n == 1 || n == 2)
			return 1;
		else
			return (a * function(a,b,n - 1) + b * function(a,b,n -2)) % 7;
	}

}
