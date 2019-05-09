package 数论;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=sc.nextLong();
			long value=pairsFormLCM(n);
			System.out.println("Case "+(i+1)+": "+value);
		}
	}
static	long pairsFormLCM( long n ) {
	     long res = 0;
	    for( int i = 1; i <= n; i++ )
	        for( int j = i; j <= n; j++ )
	           if( lcm(i, j) == n ) res++; // lcm means least common multiple
	    return res;
	}
private static int lcm(int i, int j) {
	return i*j/gcd(i,j);
}
private static int gcd(int i, int j) {
	if(j==0)return i;
	else return gcd(j, i%j);
}

}
