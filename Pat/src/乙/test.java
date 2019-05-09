package 乙;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	int c[]= {1,2,3};
	int d[]= {5,6,7};
	change1(c,d);	
	System.out.println(c[1]);
	change2(c,d);
	System.out.println(d[1]);
	}
	private static void change2(int[] c, int[] d) {
		c[1]=d[1];		
	}
	private static void change1(int[] c, int[] d) {		
		c=d;		
	}
	
}

