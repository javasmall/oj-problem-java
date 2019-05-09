package 乙;

import java.util.Scanner;

public class pat14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char first=s.charAt(0);
        s=s.substring(1);
        int dian=s.indexOf(".");
        //System.out.println(dian);
        s=s.replace(".", "");//去掉点
        String s2[]=s.split("E");
        char lr=s2[1].charAt(0);//zuoyou 
        if(lr=='-') 
        {
        	dian-=Integer.parseInt( s2[1].substring(1));
        	while(dian<1)
        	{
        		s2[0]="0"+s2[0];
        		dian++;
        	}
        	if(first=='-') {System.out.println("-"+s2[0].substring(0, dian)+"."+s2[0].substring(dian));}
        	else System.out.println(s2[0].substring(0, dian)+"."+s2[0].substring(dian));
        }
        if(lr=='+') {
        	dian+=Integer.parseInt(s2[1].substring(1));
        	while(dian>s2[0].length())
        	{
        		s2[0]+="0";        		
        	}
        	if(dian==s2[0].length())
        	{
        		if(first=='-') {System.out.println("-"+s2[0]);}
        		else
        		System.out.println(s2[0]);
        	}
        	else {
        		if(first=='-')System.out.println("-"+s2[0].substring(0, dian)+"."+s2[0].substring(dian));
        		else System.out.println(s2[0].substring(0, dian)+"."+s2[0].substring(dian));
        	}
        }
        
	}
}
