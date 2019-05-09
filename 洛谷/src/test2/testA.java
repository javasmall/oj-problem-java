package test2;

import java.util.Scanner;

public class testA {

	static int value=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9};
		boolean b[]=new boolean[9];
		dfs(a,b,1,"");
	}
	private static void dfs(int[] a, boolean[] b,int c,String d) {
		if(c==10) {
			int a1=Integer.parseInt(d.substring(0, 3));
			int a2=Integer.parseInt(d.substring(3,6));
			int a3=Integer.parseInt(d.substring(6));
			//System.out.println(a1+" "+a2+" "+a3);
			if(a2==a1*2&&a3==a1*3)
			{
				System.out.println(a1+" "+a2+" "+a3);
			}
		}
		else
		{
			for(int i=0;i<9;i++)
			{
				if(!b[i]) {
					String team=d;
					team+=a[i];
					b[i]=true;
					dfs(a, b, c+1, team);
					b[i]=false;
				}
				else continue;
			}
		}
		
	}

}
