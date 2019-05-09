package 数学;

import java.util.Scanner;
/*
 * 找规律打表
 * 一个定理，两个数之和的余数等于两个数分别的余数的和，水题
 */
public class 杭电oj1021 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        while(sc.hasNext())
        {
        	int n=sc.nextInt();
        	if(n%8==2||n%8==6)
        	{
        		System.out.println("yes");
        	}
        	else
        		System.out.println("no");
        }
	}
}
