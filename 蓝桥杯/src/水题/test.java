package 水题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
//	   System.out.println(Integer.toHexString(n).toUpperCase());
	   char a[]= {'A','B','C','D','E','F'};
	   List list=new ArrayList<>();
	   if(n==0) {list.add(0);}
	   else 
	   while(n/16>0||n%16>0)
	   {
		 
		   int t=(int) ((n)%16);
		   //System.out.println(t);
		   String team=t+"";
		   if(t>9) {team=a[t-10]+"";}
		   list.add(team);
		   n=n/16;
		   
	   }
	   for(int i=list.size()-1;i>=0;i--)
	   {
		   System.out.print(list.get(i));
	   }
	}
}
