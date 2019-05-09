package 数论;
import java.math.BigInteger;
/*
 * 卡特兰数
 * h(n)=h(n-1)*(4*n-2)/(n+1);
 */
import java.util.Scanner;

public class 杭电oj1134 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	   BigInteger dp[]=new BigInteger[105];
	   dp[1]=BigInteger.valueOf(1);
	   dp[2]=BigInteger.valueOf(2);
	   dp[3]=BigInteger.valueOf(5);
	   for(int i=4;i<105;i++)
	   {
		   dp[i]=dp[i-1].multiply((BigInteger.valueOf(4*i-2))).divide(BigInteger.valueOf(i+1));				   
	   }
	   while(sc.hasNext())
	   {
		   int j=sc.nextInt();
		   if(j==-1) {break;}
		   else
			   System.out.println(dp[j]);
	   }
	}
}
