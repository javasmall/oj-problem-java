package ��;
/*
 * ע���
 * ����Ҫ����������
 * ��Ҫ�ҵ�������Ȼ�������ӳˡ�
 * ע�����Ҫ����
 */
import java.util.Scanner;

public class pat07 {
	public static void main(String[] aargs)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min=n,length=0;
		
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				int team=0;
				int j=i,cout=i;
				while(n%cout==0)
				{
					team++;
					j++;
					cout*=j;
				}
				if(team>length) {min=i;length=team;}
			}
		}
		if(length==0) {
		System.out.println(1);
		System.out.println(n);}
		else {
			System.out.println(length);
		for(int i=0;i<length;i++)
		{
			if(i==length-1)System.out.print(min);
			else System.out.print(min+++"*");
		}
	}}
}
