package ��;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * �������ַ���
 */
public class pat11 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int a[]=new int[10];//����0-9ʮ����ĸ
		Set set=new HashSet();
		int leng=n.length();//�ַ����ľ��峤��
		for(int i=0;i<leng;i++)
		{
			char exam=n.charAt(i);
			int exam2=(exam-'0');//ת������
			set.add(exam2);
			a[exam2]++;
		}
		for(Object set1:set)
		{
			int exam=(int)set1;
			System.out.println(exam+":"+a[exam]);
		}
	}
}
