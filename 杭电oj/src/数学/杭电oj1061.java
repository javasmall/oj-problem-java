package ÊýÑ§;

import java.util.Scanner;

public class º¼µçoj1061 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        	long n=sc.nextLong();
        	long a[]=new long[11];
        	long team=1;
        	
        	for(int j=0;j<n;j++)
        	{
        		team=team*n%10;
        		a[j]=team;
        		if(j>0&&team==a[0]) {int q=(int) ((n-1)%(j));System.out.println(a[q]);break;}        		
        		if(j==n-1) {System.out.println(team);}       		
        	}
        }
	}
}
