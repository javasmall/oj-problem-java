package 大数;


import java.util.Scanner;
import java.math.BigInteger;

public class 杭电1024 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		BigInteger p1[] = new BigInteger[100000];
		p1[0]=BigInteger.ONE;
		p1[1]=BigInteger.ONE;
		for(int i=2;i<100000;i++)
		{
			p1[i]=p1[i-1].add(p1[i-2]);
			if((p1[i]+"").length()>=1000)
			{
				
				System.out.println(i+" "+p1[i]);break;
			}
		}
		
//		while(cin.hasNext())//等价于!=EOF
//		{
//			int n = cin.nextInt();
//            
//            System.out.println(p1[n]);
//		}
	}
}