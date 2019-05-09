package ´óÊý;

import java.math.BigInteger;
import java.util.Scanner;

public class º¼µç1047 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			BigInteger value=BigInteger.ZERO;
		    
			BigInteger big=sc.nextBigInteger();
			while(!big.equals(BigInteger.ZERO))
			{
			value=value.add(big);
			big=sc.nextBigInteger();
			}
			System.out.println(value);
//			if(big.equals(BigInteger.ZERO))
//			{
//				System.out.println(value);
//				//value=BigInteger.ZERO;
//			}
		
		}
	}

}
