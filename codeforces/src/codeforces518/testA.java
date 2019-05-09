package codeforces518;
import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();//总的个数
		long m=sc.nextLong();//朋友数量
		long k=sc.nextLong();//已经有的
		long l=sc.nextLong();//必须要的新的
		boolean b=false;
		if(n<m) {b=true;}
		else if(l+k>n) {b=true;}
		if(b) {System.out.println(-1);}
		else {
			long total=(l+k);//需要的总数量
			//System.out.println(total);
			long avg=(total-1)/m+1;
			if(avg*m>n) {System.out.println(-1);}
			else
			System.out.println(avg);
		}

	}

}
