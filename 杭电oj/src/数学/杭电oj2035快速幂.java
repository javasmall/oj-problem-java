package 数学;

import java.util.Scanner;
public class 杭电oj2035快速幂 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
        	long a=sc.nextLong();
        	long b=sc.nextLong();
        	if(a==0&&b==0)break;
        	System.out.println(power(a,b)%1000);
        }
	}
	private static long power(long a, long b) {
		if(b==0)return 1;
		else {if(b%2==0) {return power(a*a%1000,b/2)%1000;}
		else {return a*power(a*a%1000,b/2)%1000;}
		}
	}
}
