package ���鼯;
import java.util.Scanner;

public class ����1232 {
	static int value=0;//��ʾ��ǰ�Ѿ����ӵĳ�����
	static int a[]=new int [1001];
	public static void main(String[] args) {    
		Scanner sc = new Scanner(System.in);         
        while(sc.hasNext())
        {
        	int n=sc.nextInt();//�������
        	a=new int[n+1];
        	if(n==0)break;
        	int m=sc.nextInt();//��·����
        	for(int i=0;i<m;i++)
        	{
        		int a1=sc.nextInt();//��������
        		int a2=sc.nextInt();
        		union(a1,a2);
        	}
        	System.out.println(n-1-value);       	
        	value=0;
        }
	}
	private static void union(int a1, int a2) {
		int q1=search(a1);
		int q2=search(a2);
			if(q1==q2){}//�������ȣ���ôʲô������
			else
			{
				value++;
				a[q2]=q1;//a2ָ��a1�Ȳ������Ż�
				a[q1]--;
			}
	}
	private static int search(int a1) {
		if(a[a1]<=0) {return a1;}
		else
			return search(a[a1]);		
	}	
}
