package test��;

import java.math.BigInteger;
import java.util.Scanner;

public class p1017 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		BigInteger b1=sc.nextBigInteger();
		BigInteger b2=sc.nextBigInteger();
		BigInteger b3=b1.divide(b2);
		BigInteger b4=b2.multiply(b3);
		BigInteger b5=b1.subtract(b4);
		System.out.println(b3+" "+b5);
		

	}

}
