package codeforces540;

import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		
		for(int s=0;s<q;s++)
		{
			long n=sc.nextLong();//
			long a=sc.nextLong();//1L�ļ�Ǯ
			long b=sc.nextLong();//2L�ļ�Ǯ
			if(a*2<=b)System.out.println(n*a);
			
			else
			{
				if(n%2==0)System.out.println(n*b/2);
				else {
					long t2=(n/2)*b+a;
					System.out.println(t2);
				}
			}
		}

	}

}
