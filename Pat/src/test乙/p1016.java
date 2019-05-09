package test““;

import java.util.Scanner;

public class p1016 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        String a1=sc.next(); String a2=sc.next();
        String b1=sc.next();String b2=sc.next();
        String x1="";
        char a3[]=a1.toCharArray();
        int ass=0;
        for(int i=0;i<a3.length;i++)
        {
        	if (a3[i]==a2.charAt(0))
        	{
        		x1+=a3[i];
        	}
        }
        if(x1!="") { ass+=Integer.parseInt(x1);}
        String x2="";
        char a4[]=b1.toCharArray();
        for(int i=0;i<a4.length;i++)
        {
        	if (a4[i]==b2.charAt(0))
        	{
        		x2+=a4[i];
        	}
        }
        if(x2!="") { ass+=Integer.parseInt(x2);}
        
        System.out.println(ass);
	}
}
