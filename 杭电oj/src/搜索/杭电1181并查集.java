package ����;

import java.util.Scanner;

public class ����1181���鼯 {

	static int a[];//���ظ��ڵ�
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������		
		Scanner sc=new Scanner(System.in);
		init();
		while(sc.hasNext())
		{
			String str=sc.next();
			if(str.equals("0")) {
				
				int index=a[12];
				if(a[12]==-1) {System.out.println("No.");}//m�����û�и���
				else
				{
					int value=search(12);
					if(value==1) {System.out.println("Yes.");}
					else System.out.println("No.");
				}
				init();
			}
			else
			{
				int start=str.charAt(0)-'a';
				int  end=str.charAt(str.length()-1)-'a';
				join(start, end);
			}
		}
	}
	static void init() {
		a=new int[26];
		for(int i=0;i<26;i++)
		{
			a[i]=-1;
		}
	}
	static int search(int i)//���Ҹ��ڵ��� 
	{
		if(a[i]==-1)return i;
		else return  search(a[i]);
	}
	static void join(int b1,int b2)//b1<-b2   b1Ϊ����
	{
		int a1=search(b1);//b1���ڵ�
		int a2=search(b2);//b2 ���ڵ�
		if(a1==a2) {}//�Ѿ���һ������ 
		else if(a1==12) {}//m�㲻���κε�ĸ��ڵ㣬������ײ�ĸ��ڵ�
		else {
			a[a2]=a1;
		}
	}
}
