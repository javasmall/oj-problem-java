package 乙;

import java.util.Arrays;
import java.util.Scanner;

public class pat9 {
	public static void main(String[] args)
	{
		  String sheng="";
		  String jiang="";String s="";
	  Scanner sc=new Scanner(System.in);	
	  int n=sc.nextInt();
	  if(n/1000==(n%1000)/100&&(n%100)/10==n%10&&n/1000==n%10)//四个相同的情况
	  {
		  System.out.println(n+" - "+n+" = "+"0000");//注意输出的空格
	  }
	  else
	  {
		  if(n==6174)//简便写
		  {
			  System.out.println(7641+" - "+1467+" = "+6174);
		  }
		  else {
		  s=String.valueOf(n);
		  if(s.length()==3) {s="0"+s;}
		  if(s.length()==2) {s="00"+s;}
		  if(s.length()==1) {s="000"+s;}
		  while(n!=6174) {
		  sheng="";
		   jiang="";		   
		  String[]exam=s.split("");//将数字转化为字符数组
		  Arrays.sort(exam);//升序
//		  char[]exam2=new char[4];
		  for(int j=0;j<exam.length;j++)
		  {
			  sheng+=exam[j];
			  jiang=exam[j]+jiang;
			  
		  }
		  n=Integer.parseInt(jiang)-Integer.parseInt(sheng);
		   s=String.valueOf(n);
		  if(s.length()==3) {s="0"+s;}
		  if(s.length()==2) {s="00"+s;}
		  if(s.length()==1) {s="000"+s;}
		  System.out.println(jiang+" - "+sheng+" = "+s);}//注意输出的空格
		  }
	  }
	}
}
