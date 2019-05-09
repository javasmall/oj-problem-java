package 乙;

import java.util.Scanner;

public class pat8 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b1[]=new int[3];//赢 平 输
		int b2[]=new int[3];
		int win1[]=new int[3];//c  j   b     b c j
		int win2[]=new int[3];//赢的情况下那个最多
		for(int i=0;i<a;i++)
		{
			String x1=sc.next();
			String x2=sc.next();
			if(x1.equals("C"))//锤子
			{
				if(x2.equals("C")) {b1[1]++;b2[1]++;}
				if(x2.equals("J")) {b1[0]++;b2[2]++; win1[1]++;}
				if(x2.equals("B")) {b1[2]++;b2[0]++; win2[0]++;}
			}
			if(x1.equals("J"))//锤子
			{
				if(x2.equals("C")) {b1[2]++;b2[0]++;win2[1]++;}
				if(x2.equals("J")) {b1[1]++;b2[1]++; }
				if(x2.equals("B")) {b1[0]++;b2[2]++;win1[2]++; }
			}
			if(x1.equals("B"))//锤子
			{
				if(x2.equals("C")) {b1[0]++;b2[2]++;win1[0]++;}
				if(x2.equals("J")) {b1[0]++;b2[2]++; win2[2]++;}
				if(x2.equals("B")) {b1[1]++;b2[1]++; }
			}
		}
		System.out.println(b1[0]+" "+b1[1]+" "+b1[2]);
		System.out.println(b2[0]+" "+b2[1]+" "+b2[2]);
		int shuzi=0;
		int value=0;
		char shu='B';
		for(int i=0;i<3;i++)
		{
			if(win1[i]>shuzi)
			{
				shuzi=win1[i];	
				value=i;
			}
		}
		switch(value) {
		case 0:shu='B';break;
		case 1:shu='C';break;
		case 2:shu='J';break;
		}
		System.out.print(shu+" ");
		 shuzi=0;
		 shu='B';
		 value=0;
		for(int i=0;i<3;i++)
		{
			if(win2[i]>shuzi)
			{
				shuzi=win2[i];	
				value=i;
			}
		}
		switch(value) {
		case 0:shu='B';break;
		case 1:shu='C';break;
		case 2:shu='J';break;
		}
		System.out.println(shu);
	}
}
