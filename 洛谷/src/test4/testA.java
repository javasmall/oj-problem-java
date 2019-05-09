package test4;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double value=0;
		if(a<=150) {System.out.println(String.format("%.1f", a*0.4463));return;}
		else {
			value+=150*0.4463;
			if(a<400) {value+=(a-150)*0.4663;System.out.println(String.format("%.1f", value));return;}
			else {
				value+=250*0.4663;
				value+=(a-400)*0.5663;
				System.out.println(String.format("%.1f", value));
			}
		}

	}

}
