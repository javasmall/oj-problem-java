package 乙;

import java.util.Scanner;

public class pat27 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String p=sc.next();//应付价钱
		String a=sc.next();//实际付钱
		String p1[]=p.split("\\.");
		String a1[]=a.split("\\.");//要计算a-p
		int Galleon=0;//17加仑换
		int Sickle=0;//29纳特换
		int Knut=0;
		int k=0;//判断向上借位
		for(int i=3;i>0;i--)
		{
			int value=0;
			if(judgel(p1,a1)) {
			 value=Integer.parseInt(a1[i-1])-Integer.parseInt(p1[i-1])-k;}
			else
				{ value=Integer.parseInt(p1[i-1])-Integer.parseInt(a1[i-1])-k;}
			k=0;
			if(value<0)
			{
				k++;
				if(i==3) {value+=29;Knut=value;}
				if(i==2) {value+=17;Sickle=value;}
				if(i==1) {Galleon=value;}
			}
			else
			{
				if(i==3) {Knut=value;}
				if(i==2) {Sickle=value;}
				if(i==1) {Galleon=value;}
			}
		}
		String jud="";
		if(!judgel(p1,a1)) {jud+="-";}
		System.out.println(judgel(p1,a1));
		System.out.println(jud+Galleon+"."+Sickle+"."+Knut);
	}

	private static boolean judgel(String[] p1, String[] a1) {
		if(Integer.parseInt(a1[0])-Integer.parseInt(p1[0])>0)
			{return true;}
		if(Integer.parseInt(a1[0])-Integer.parseInt(p1[0])==0&&Integer.parseInt(a1[1])-Integer.parseInt(p1[1])>0)
			return true;
		 if(Integer.parseInt(a1[0])-Integer.parseInt(p1[0])==0&&Integer.parseInt(a1[1])-Integer.parseInt(p1[1])==0)
		{
			if(Integer.parseInt(a1[2])-Integer.parseInt(p1[2])>0) {return true;}		
		}		
		return false;
	}
}
