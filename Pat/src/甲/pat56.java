package ¼×;

import java.math.BigDecimal;
import java.util.Scanner;

public class pat56 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		BigDecimal big=new BigDecimal(s);
		 s=big.toPlainString();
		System.out.println(s);
	}
}
