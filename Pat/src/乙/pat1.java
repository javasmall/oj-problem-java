package ““;

import java.util.Scanner;

public class pat1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean b=false;
		for(int i=1;i<a+1;i++)
		{			
			
				long a1=sc.nextLong();
				long a2=sc.nextLong();
				long a3=sc.nextLong();
				b=(a1+a2>a3);
				System.out.println("Case #"+i+": "+b);			
		}
	}
}
