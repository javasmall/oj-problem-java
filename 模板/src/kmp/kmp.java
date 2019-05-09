package kmp;

public class kmp {
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
	    int []nextt=getNext(ts);
	    int count=0;
	    while (i < t.length) {
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
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a="AZAZAZA";
		String b="AZA";
		System.out.println(KMP(a, b));

	}
/*
 * public static int[] getNext(String ps) {
    char[] p = ps.toCharArray();
    int[] next = new int[p.length];
    next[0] = -1;
    int j = 0;
    int k = -1;
    while (j < p.length - 1) {
       if (k == -1 || p[j] == p[k]) {
           if (p[++j] == p[++k]) { // 当两个字符相等时要跳过
              next[j] = next[k];
           } else {
              next[j] = k;
           }
       } else {
           k = next[k];
       }
    }
    return next;
}
 */
}
