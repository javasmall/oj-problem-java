package ��ѧ;
/*
 * �㲻��ΪɶҪ10001�������С����֪����ʲô�������
 * ���ķ���
 */
import java.util.Scanner;

public class ����oj2035 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0) {break;}
			long team=1;
			int first=0;int firstvalue=0;
			long value[]=new long[10001];
			for(int i=0;i<b;i++)
			{
				team=team*a%1000;
				value[i]=team;
				if(team==firstvalue&&team!=0) {System.out.println(value[(b-first-1)%(i-first)+first]);break;}
				else if(team>=100&&first==0) {first=i;firstvalue=(int) team;}
				 if(i==b-1) {System.out.println(team%1000);}
			}
		}

	}

}
