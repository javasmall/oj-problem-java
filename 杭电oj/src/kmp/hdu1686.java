package kmp;

import java.util.Scanner;

public class hdu1686 {
	public static int[] getNext(String ps) {
	    char[] p = ps.toCharArray();
	    int[] next = new int[p.length];
	    next[0] = -1;
	    int j = 0;
	    int k = -1;
	    while (j < p.length - 1) {
	       if (k == -1 || p[j] == p[k]) {
	           next[++j] = ++k;
	       } else {
	           k = next[k];
	       }
	    }
	    return next;
	}
	public static int KMP(String ts, String ps) {
	    char[] t = ts.toCharArray();
	    char[] p = ps.toCharArray();
	    int i = 0; // 主串的位置
	    int j = 0; // 模式串的位置
	    int[] next = getNext(ps);
	    int count=0;
	    while (i < t.length && j < p.length) {
	       if (j == -1 || t[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
	           i++;
	           j++;
	       } else {
	           // i不需要回溯了
	           // i = i - j + 1;
	           j = next[j]; // j回到指定位置
	       }
	       if(j==p.length) {count++;j=next[j-1];i--;}
	    }
	    return count;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String a=sc.next();
			String b=sc.next();
			int value=KMP(b, a);
			System.out.println(value);
			
		}		
	}
}
