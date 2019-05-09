package test““;

import java.util.Scanner;

public class p1012 {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    		int a=sc.nextInt();
    		int b[]=new int[a];
    	    boolean jud=false;
    		int a1 = 0,a2 = 0,a3 = 0,b4=0,a5 = 0;
			double a4 = 0;
    		int value=1;
    		for(int i=0;i<a;i++)
    		{
    			b[i]=sc.nextInt();
    			if(b[i]%5==0&&b[i]%2==0) {a1+=b[i];}
    			if(b[i]%5==1) {jud=true;a2+=value*b[i];value=-value;}
    			if(b[i]%5==2) {a3++;}
    			if(b[i]%5==3) {a4+=b[i];b4++;}
    			if(b[i]%5==4) {if(b[i]>a5)a5=b[i];}
    		}
    	
    		if(a1!=0) {System.out.print(a1+" ");}
    		else System.out.print("N "); 
    		if(jud==true) {System.out.print(a2+" ");}
    		else System.out.print("N "); 
    		if(a3!=0) {System.out.print(a3+" ");}
    		else System.out.print("N "); 
    		if(a4!=0) {a4=a4/b4;
            String a44=String.format("%.1f", a4);System.out.print(a44+" ");}
    		else System.out.print("N "); 
    		if(a5!=0) {System.out.print(a5);}  
    		else System.out.print("N");
    		System.out.println();
	}
}
