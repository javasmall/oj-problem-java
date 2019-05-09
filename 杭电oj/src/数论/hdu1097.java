package 数论;

import java.util.Scanner;
public class hdu1097 {
   static long c=1000000007;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long a=2;
			long b=sc.nextLong();			
			long value=divide((long)2,b);
			System.out.println(value%c);
		}
	}
	private static long divide(long a,long b) {
		if(b==0)return 1;
		else if(b%2==0) {return divide((a%c)*(a%c),b/2)%c;}
		else return a%c*divide((a%c)*(a%c),(b-1)/2)%c;
	}
}
