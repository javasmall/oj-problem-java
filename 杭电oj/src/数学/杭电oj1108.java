package 数学;
/*
 * 欧几里德算法
 */
import java.util.Scanner;

public class 杭电oj1108 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int da=a>b?a:b;
		int xiao=a<b?a:b;
		int gc=gcd(da,xiao);
		System.out.println(a*b/gc);
//		int team=a>b?a:b;
//		for(int i=team;;i++)
//		{
//			if(i%a==0&&i%b==0) {System.out.println(i);break;}
//		}
		}
	}
	static int gcd(int da,int xiao)
	{
		int team = 0;
		while(xiao!=0)
		{
			team=da%xiao;
			da=xiao;
			xiao=team;
		}
		return da;
	}

}
