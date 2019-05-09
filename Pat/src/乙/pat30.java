package ““;

import java.util.Scanner;

public class pat30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c[]=str.toCharArray();
		long p=0,pa=0,pat=0;
		for(int i=0;i<c.length;i++)
		{
			 if(c[i]=='P') {
			        p++;
			    }else if(c[i]=='A') {
			        pa+=p;
			    }else {
			        pat+=pa%1000000007;
			    }
		}
		System.out.println(pat%1000000007);
}
}