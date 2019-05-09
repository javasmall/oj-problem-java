package 乙;

import java.util.Scanner;
public class pat24 {
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String a11=sc.next();
         String a22=sc.next();
         String a[]=a11.split("/");
         String b[]=a22.split("/");
         int a1=Integer.parseInt(a[0]);         
         int a2=Integer.parseInt(a[1]);
         int b1=Integer.parseInt(b[0]);
         int b2=Integer.parseInt(b[1]);      
         int add1=0,delete1=0,cheng1=0;//chu法要考虑是否为零
         int add2=0,delete2=0,cheng2=0;//分母
         add1=a1*b2+a2*b1;   add2=a2*b2;
         delete1=a1*b2-a2*b1; delete2=a2*b2;
         cheng1=a1*b1; cheng2=a2*b2;     
         String no1=getstring(a1,a2);// System.out.println(14545);
         String no2=getstring(b1,b2);
         System.out.println(no1+" + "+no2+" = "+getstring(add1,add2));
         System.out.println(no1+" - "+no2+" = "+getstring(delete1,delete2));
         System.out.println(no1+" * "+no2+" = "+getstring(cheng1,cheng2));
         if(b1!=0)
         {
        	 int chu1=a1*b2;
        	 int chu2=b1*a2;
        	 if(chu2<0) {chu2=-chu2;chu1=-chu1;}
        	 System.out.println(no1+" / "+no2+" = "+getstring(chu1,chu2));
         }
         else
         {
        	 System.out.println(no1+" / "+no2+" = Inf");
         }

	}
	private static String getstring(int add1, int add2) {
		//System.out.println(add1+" "+add2);
		String value="";
		if(add1==0) {return "0";}
		else {
		boolean judgel=false;
		if(add1<0) 
		{value+="(-";add1=-add1;judgel=true;}		
		int a=gongyue(add1,add2);
		while(a!=1)
		{
			add1/=a;
			add2/=a;
			a=gongyue(add1,add2);			
		}	
		int a1=0,a2=0;
		if(add2==0) {a1=0;a2=add1;}
		else {	
			
			//if(add2==1) {a1=add1;a2=0;}
		 a1=add1/add2;
		 a2=add1%add2;}
		//System.out.println(add1+" "+add2+"   555555");
		if(a1!=0)//前面不等于零
			{
			if(a2!=0)
		    value+=a1+" ";
			else
				value+=a1;
			}		
		if(a2!=0)
		{
			 value+=a2+"/"+add2;
		}
		else {if(a1==0)value+="0";}
		if(judgel) {value+=")";}
		return value;}
	}
	static int gongyue(int a,int b) 
	{
		if(a==b)return 1;
		else
		{
		int big=a>b?a:b;
		int small=a>b?b:a;
		
		while(big-small>0)
		{		
			//System.out.println(big+" "+small);
			
			big=big-small;
			
			if(small>big)
			{
				int team=big;
				big=small;
				small=team;
			}
		}	
		return big;	
		}				
	}
}
