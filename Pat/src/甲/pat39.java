package ��;

import java.util.Scanner;

public class pat39 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		//����s2-s1
		String s="";
		for(int i=0;i<a1.length;i++)//a2��ͷ����
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
