package 数论;

import java.math.BigInteger;
import java.util.Scanner;

public class testK {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			BigInteger a1=sc.nextBigInteger();
			BigInteger b2=sc.nextBigInteger();
			if(b2.compareTo(BigInteger.ZERO)<0) {b2=BigInteger.ZERO.subtract(b2);}
			String value="";
			BigInteger b3=a1.mod(b2);
			if(b3.equals(BigInteger.valueOf(0))) {value="divisible";}
			else value="not divisible";
			System.out.println("Case "+(i+1)+": "+value);
		}
	}
}
