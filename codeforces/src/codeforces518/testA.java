package codeforces518;
import java.util.Scanner;

public class testA {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();//�ܵĸ���
		long m=sc.nextLong();//��������
		long k=sc.nextLong();//�Ѿ��е�
		long l=sc.nextLong();//����Ҫ���µ�
		boolean b=false;
		if(n<m) {b=true;}
		else if(l+k>n) {b=true;}
		if(b) {System.out.println(-1);}
		else {
			long total=(l+k);//��Ҫ��������
			//System.out.println(total);
			long avg=(total-1)/m+1;
			if(avg*m>n) {System.out.println(-1);}
			else
			System.out.println(avg);
		}

	}

}
