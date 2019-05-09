package ´óÊý;

import java.math.BigInteger;
import java.util.Scanner;

public class º¼µç1002 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		//sc.nextLine();
		for(int i=0;i<t;i++)
		{
			String a=sc.next();
			String b=sc.next();
			BigInteger b1=new BigInteger(a);
			BigInteger b2=new BigInteger(b);
			BigInteger value=b1.add(b2);
//			char leng[],min[];
//			if(a.length()>b.length()) {
//			 leng=a.toCharArray();
//		     min=b.toCharArray();}
//			else
//			{
//				leng=b.toCharArray();
//			     min=a.toCharArray();
//			}		   
//		   String value="";
//		    int team=0;
//		    for(int j=0;j<leng.length;j++)
//		    {
//		    	if(j<min.length)
//		    	{
//		    		team+=(leng[leng.length-j-1]-'0')+(min[min.length-j-1]-'0');
//		    		if(team>=10)
//		    		{
//		    			value=(team-10)+value;
//		    			team=1;
//		    		}
//		    		else
//		    		{
//		    			value=team+value;
//		    			team=0;
//		    		}		    					    				
//		    	}
//		    	else
//		    	{
//		    		team+=(leng[leng.length-j-1]-'0');
//		    		if(team>=10)
//		    		{
//		    			value=(team-10)+value;
//		    			team=1;
//		    		}
//		    		else
//		    		{
//		    			value=team+value;
//		    			team=0;
//		    		}
//		    	}		    		
//		    }
//		    while(value.startsWith("0"))
//		    {
//		    	value=value.substring(1);
//		    }
		    System.out.println("Case "+(i+1)+":");
		    if(i!=t-1)
		    { System.out.println(a+" + "+b+" = "+value);
		    System.out.println();}
		    else
		    	System.out.println(a+" + "+b+" = "+value);
		}
	}
}
