package สýัง;

import java.util.Scanner;


import java.math.BigInteger;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			BigInteger a = in.nextBigInteger();
			int b = in.nextInt();
			if(a.equals(BigInteger.ZERO) && b == 0) break;
			System.out.println(a.pow(b).mod(new BigInteger("1000")));
		}
		in.close();
	}
}