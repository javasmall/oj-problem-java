package codefores515;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int q=0;q<t;q++)
		{
			int L=sc.nextInt();
			int v=sc.nextInt();
			int l=sc.nextInt();
			int r=sc.nextInt();
			boolean b=false;
			//if(L%v!=0) {b=true;System.out.println(0);}
			 {
				int all1=L/v;
				int all2=r/v;
				int all3=(l-1)/v;
				int value=all1-(all2-all3);
				System.out.println(value);
			}
		}

	}

}
