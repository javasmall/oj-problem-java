package ��;

import java.util.Scanner;

public class pat17 {
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int  a=sc.nextInt();
	 char b=sc.next().charAt(0);
	 int ceng=1;//�������
	 int cengvalue=1;//value��ʼ��һ��
	 int last=0;//���ʣ���
	 while(a-cengvalue>=0)
	 {
		 ceng++;
		 cengvalue=ceng*ceng*2-1;
		 
	 }
	 ceng--;//���һλ
	// System.out.println(ceng);
	 
	  last=a-ceng*ceng*2+1;
	  //int heng=2*ceng-1;
	  for(int i=0;i<ceng;i++)
	  {
		  for(int j=0;j<i;j++)
		  System.out.print(" ");
		  for(int j=0;j<(ceng-i)*2-1;j++)
		  {
			  System.out.print(b);
		  }
		  System.out.println();
	  }
	  for(int i=1;i<ceng;i++)
	  {
		  for(int j=0;j<ceng-i-1;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j=0;j<2*i+1;j++)
		  {
			  System.out.print(b);
		  }
		  System.out.println();
	  }
	  System.out.println(last);
	 
	}
}
