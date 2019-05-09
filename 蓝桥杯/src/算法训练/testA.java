package 算法训练;

import java.util.Arrays;
import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
        	int l=sc.nextInt();
        	int r=sc.nextInt();
        	int k=sc.nextInt();
        	int b[]=a.clone();
        	Arrays.sort(b, l-1,r);
        	System.out.println(b[r-k]);
        }
	}

}
