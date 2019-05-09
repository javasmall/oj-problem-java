package codeforces494;

import java.util.Scanner;

public class codeB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//a¸ö0
		int b=sc.nextInt();
		int x=sc.nextInt();//x¸ö
		StringBuffer bu=new StringBuffer("");
		for(int i=0;i<a;i++)
		{
			bu.append("0");
		}
		String s=bu.toString();
		StringBuffer bu2=new StringBuffer("");
		for(int i=0;i<b;i++)
		{
			bu2.append("1");
		}
		String s2=bu2.toString();
		if(s.length()<s2.length())
		{
			String team=s;
			s=s2;
			s2=team;
			a=b;
		}
		if(x%2==0)//Å¼Êý
		{
			int team=x;
			if(x>2)
			{
			while(team>2)
			{
			s=s.substring(0,a-1-(x-team)/2)+s2.substring(0,1)+s.substring(a-1-(x-team)/2);
			s2=s2.substring(1);
			team=team-2;
			}	
			s=s.substring(0,a-1-(x-team)/2)+s2+s.substring(a-1-(x-team)/2);}
			else
			{
				s=s.substring(0,1)+s2+s.substring(1);
			}
		}
		else
		{
			int team=x;
			while(team>1)
			{
				s=s.substring(0,a-1-(x-team)/2)+s2.substring(0,1)+s.substring(a-1-(x-team)/2);
				s2=s2.substring(1);
				team=team-2;
			}
			s+=s2;
		}
		System.out.println(s);
	}
}
