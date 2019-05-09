package 甲;

import java.util.Scanner;

public class pat39 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		//计算s2-s1
		String s="";
		for(int i=0;i<a1.length;i++)//a2从头过滤
		{		
			for(int j=0;j<a2.length;j++)
			{
				if(a2[j]==a1[i])
			    {
				   a1[i]='0';break;
			    }
		   }
		}
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!='0')
			{s+=a1[i];}
		}	
		System.out.println(s);

	}

}
